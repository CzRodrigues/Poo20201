import java.awt.*;
import java.util.Random;

import collisions.CollisionPhysics;
import collisions.CollisionResponse;
//Classe bola
public class Ball {
    private float x, y;
    private float speedX, speedY;
    private float radius;
    private Color color;
    private static final Color DEFAULT_COLOR = Color.BLUE;
    CollisionResponse earliest = new CollisionResponse();
    private CollisionResponse temp = new CollisionResponse();

    //Construtor da classe Ball
    public Ball(float x, float y, float radius, int speed, float angleInDegree, Color color) {
        this.x = x;
        this.y = y;
        this.speedX = (float)(speed * Math.cos(Math.toRadians(angleInDegree)));
        this.speedY = (float)(-speed * Math.sin(Math.toRadians(angleInDegree)));
        this.radius = radius;
        this.color = color;
    }

    //Outro construtor sem a cor da bola
    public Ball(float x, float y, float radius, int speed, float angleInDegree) {
        this(x, y, radius, speed, angleInDegree,  DEFAULT_COLOR);
    }
    
    //Métodos get e set dos parametros da bola
    public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getSpeedX() {
		return speedX;
	}

	public void setSpeedX(float speedX) {
		this.speedX = speedX;
	}

	public float getSpeedY() {
		return speedY;
	}

	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
    
    //Gráficos da bola
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int) (x - radius),(int) (y - radius) ,(int) (2 * radius),(int) (2 * radius));
    }

    //Função que verifica se a bola bate nos limites do conteiner
    public void intersect(Container c, float timeLimit) {
        CollisionPhysics.pointIntersectsRectangleOuter(this.x, this.y, this.speedX, this.speedY, this.radius, c.initialX, c.initialY, c.finalX, c.finalY, timeLimit, temp);
        if(temp.time < earliest.time) {
            earliest.copy(temp);
        }
    }

    //Função que atualiza o novo movimento da bola e troca sua cor caso ela encontre a borda do retangulo
    public void update(float time) {
        if(earliest.time <= time) {
            this.x = earliest.newX(this.x, this.speedX);
            this.y = earliest.newY(this.y, this.speedY);
            this.speedX = (float) earliest.newSpeedX;
            this.speedY = (float) earliest.newSpeedY;
            this.color = newColor();
        } else {
            this.x += this.speedX * time;
            this.y += this.speedY * time;
        }
        earliest.reset();
    }

    //Função que troca a cor da bola
    public Color newColor() {
        Random rand = new Random();
        int r = rand.nextInt(255 + 1);
        int g = rand.nextInt(255 + 1);
        int b = rand.nextInt(255 + 1);
        return new Color(r,g,b);
    }
}
