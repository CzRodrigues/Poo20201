import javax.swing.JFrame;

public class App {
    
    //Função main com a inicialização da janela
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Bouncing Ball");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(new BouncingBall(640, 480));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
