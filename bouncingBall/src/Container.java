import java.awt.*;

public class Container {
    int initialX, finalX, initialY, finalY;
    private Color background;
    private static final Color DEFAULT_COLOR_FILLED = Color.WHITE;

    //Métodos get
    public int getInitialX() {
        return initialX;
    }

    public int getInitialY() {
        return initialY;
    }

    public int getFinalX() {
        return finalX;
    }

    public int getFinalY() {
        return finalY;
    }

    public Color getBackground() {
        return background;
    }

    //Métodos set
    public void setInitialX(int newInitialX) {
        this.initialX = newInitialX;
    }

    public void setInitialY(int newInitialY) {
        this.initialY = newInitialY;
    }

    public void setFinalX(int newFinalX) {
        this.finalX = newFinalX;
    }

    public void setFinalY(int newFinalY) {
        this.finalY = newFinalY;
    }

    public void setBackground(Color newBackground) {
        this.background = newBackground;
    }
    
    //Construtor do container
    public Container(int x, int y, int width, int height, Color background) {
        initialX = x;
        initialY = y;
        initialX = x + width - 1;
        initialY = y + height - 1;
        this.background = background;
    }

    //Construtor do container com a cor padrão
    public Container(int x, int y, int width, int height) {
        this(x, y, width, height, DEFAULT_COLOR_FILLED);
    }

    //Desenha o container
    public void draw(Graphics g) {
        g.setColor(background);
        g.fillRect(initialX, initialY, finalX - initialX - 1, finalY - initialY - 1);
    }

    //Define o tamanho do container
    public void set(int x, int y, int width, int height) {
        initialX = x;
        initialY = y;
        finalX = x + width - 1;
        finalY = y + height - 1;
    }
}
