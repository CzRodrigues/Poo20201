import static BouncingBall.StdDraw.*;
import java.awt.Color;
import java.util.Random;

public class BouncingBall { 
    public static void main(String[] args) {

        //STD DRAWS consiste na biblioteca para adicionar desenhos com funções pre-estabelicidas no proprio java
        //link: https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
        //Aqui setamos as dimensões do quadrado e chamamos o C criado por uma função abaixo 
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        Color c = new Color(100,100,100);

        // Chando a funcao de criar os circulos e repassando seus devidos parametros
        Circle circle1 = new Circle(.480, .860, .015, .023);
        Circle circle2 = new Circle(.480, .860, -.015, -.023);
        // Raio
        double radius = .05;
        // Variavel de contagem               
        int Batebate = -2;
        
        while (true)  { 
            //Primeira cor de background
            StdDraw.setPenColor(c);
            // Craiação do quadrado
            StdDraw.filledSquare(0.0,0.0,1.0);
            // Os 4 'ifs' consistem em fazer  o movimento da bola quando ela tomar nas paredes 
            if (circle1.rx - radius + circle1.vx < -1.0 || circle1.rx + radius + circle1.vx > 1.0) circle1.vx = -circle1.vx;
            if (circle1.ry - radius + circle1.vy < -1.0 || circle1.ry + radius + circle1.vy > 1.0) circle1.vy = -circle1.vy;

            if (circle2.rx - radius + circle2.vx < -1.0 || circle2.rx + radius + circle2.vx > 1.0) circle2.vx = -circle2.vx;
            if (circle2.ry - radius + circle2.vy < -1.0 || circle2.ry + radius + circle2.vy > 1.0) circle2.vy = -circle2.vy;

            // Condicional para trocar de cor, aleatoria das cores, contador 
            if ((Math.abs((circle1.rx + radius / 2) - (circle2.rx + radius / 2)) <= radius) && (Math.abs(circle1.ry + radius / 2) - (circle2.ry + radius / 2) <= radius)){
                circle1.vx = -circle1.vx;
                circle2.vx = -circle2.vx;
                c = randomColor();
                Batebate++;
            }
            
            // Movimento das bolas
            circle1.rx = circle1.rx + circle1.vx; 
            circle1.ry = circle1.ry + circle1.vy;
            
            circle2.rx = circle2.rx + circle2.vx; 
            circle2.ry = circle2.ry + circle2.vy;

            //Cor das bolas
            StdDraw.setPenColor(StdDraw.BLACK);
            // Execução das bolas 
            StdDraw.filledCircle(circle1.rx, circle1.ry, radius);
            StdDraw.filledCircle(circle2.rx, circle2.ry, radius);
            //Mensagem 
            StdDraw.text(.015, .023, "'How many times these balls have been hitted each other: "+ Batebate +"'");
            //Execução do programa
            StdDraw.show(20);

        }
        
    }
    
    // Class para Randomizar as cores
    public static Color randomColor() {
        Random rand = new Random();
        // Randomização das cores
        int r = rand.nextInt(255 + 1);
        int g = rand.nextInt(255 + 1);
        int b = rand.nextInt(255 + 1);
        
        return new Color(r,g,b);
    } 
}
