import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


@SuppressWarnings("serial")
//Classe que irá conter os elementos gráficos e a thread do game
public class BouncingBall extends JPanel {
    private static final int fps = 60;
    private static final float TIME_MIN = 1e-2f;
    
    private Ball b;

    private Container c;
    
    private DrawCanvas canvas;
    private int canvasWidth;
    private int canvasHeight;

    //Construtor do tamanho da janela e inicialização da bola, container e canvas
    public BouncingBall(int width, int height) {
        canvasWidth = width;
        canvasHeight = height;
        
        //Inicialização da bola e do conteiner
        Random rand = new Random();
        int x = rand.nextInt(canvasWidth - 200 * 2 - 20) + 200 + 10;
        int y = rand.nextInt(canvasHeight - 200 * 2 - 20) + 200 + 10;
        int angle = rand.nextInt(360);
        b = new Ball(x, y, 30, 5, angle);       
        c = new Container(0, 0, canvasWidth, canvasHeight);

        //Inicialiação do elementos gráficos
        canvas = new DrawCanvas();
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);
        

        //Ajuste do tamanho da janela e da inicialização do "jogo"
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized (ComponentEvent e) {
                Component comp = (Component)e.getSource();
                Dimension dim = comp.getSize();
                canvasWidth = dim.width;
                canvasHeight = dim.height;

                c.set(0, 0, canvasWidth, canvasHeight);
            }});
        gameStart();

    }

    //Inicialização da Thread do "jogo"
    public void gameStart() {
        Thread gameThread = new Thread() {
            public void run() {
                while(true) {
                    long beginTime, timeTaken, timeLeft;
                    beginTime = System.currentTimeMillis();
                    gameUpdate();
                    repaint();
                    timeTaken = System.currentTimeMillis() - beginTime;
                    timeLeft = 1000L / fps - timeTaken;
                    if(timeLeft < 5) {
                        timeLeft = 5;
                    }
                    try {
                        Thread.sleep(timeLeft);
                    } catch (InterruptedException ex) {}
                }
            }
        };
        gameThread.start();
    }

    //Atualização dos eventos da bola em função do tempo
    public void gameUpdate() {
        float timeLeft = 1.0f;
        do {
            float earliest = timeLeft;
            b.intersect(c, timeLeft);
            if(b.earliest.time < earliest) {
                earliest = b.earliest.time;
            }
            b.update(earliest);
            if(earliest > 0.05) {
                repaint();
                try {
                    Thread.sleep((long)(1000L / fps * earliest));
                } catch (InterruptedException ex) {}
            }
            timeLeft -= earliest;
        } while(timeLeft > TIME_MIN);
    }

    //Classe dos elementos gráficos
    class DrawCanvas extends JPanel {
        //Override para "pintar" os elementos gráficos na tela
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            c.draw(g);
            b.draw(g);
        }

        //Ajuste da dimensão da janela
        @Override
        public Dimension preferredSize() {
            return (new Dimension(canvasWidth, canvasHeight));
        }
    }
}
