import static BouncingBall.StdDraw.*;
import java.awt.Color;
import java.util.Random;

public class BouncingBall { 
    public static void main(String[] args) {

        
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        Color c = new Color(100,100,100);

      
        Circle circle1 = new Circle(.480, .860, .015, .023);
        Circle circle2 = new Circle(.480, .860, -.015, -.023);
        double radius = .05;              
        int Batebate = -2;
        
        while (true)  { 
            StdDraw.setPenColor(c);
            StdDraw.filledSquare(0.0,0.0,1.0);
            
            if (circle1.rx - radius + circle1.vx < -1.0 || circle1.rx + radius + circle1.vx > 1.0) circle1.vx = -circle1.vx;
            if (circle1.ry - radius + circle1.vy < -1.0 || circle1.ry + radius + circle1.vy > 1.0) circle1.vy = -circle1.vy;

            if (circle2.rx - radius + circle2.vx < -1.0 || circle2.rx + radius + circle2.vx > 1.0) circle2.vx = -circle2.vx;
            if (circle2.ry - radius + circle2.vy < -1.0 || circle2.ry + radius + circle2.vy > 1.0) circle2.vy = -circle2.vy;

            if ((Math.abs((circle1.rx + radius / 2) - (circle2.rx + radius / 2)) <= radius) && (Math.abs(circle1.ry + radius / 2) - (circle2.ry + radius / 2) <= radius)){
                circle1.vx = -circle1.vx;
                circle2.vx = -circle2.vx;
                c = randomColor();
                Batebate++;
            }
          
            circle1.rx = circle1.rx + circle1.vx; 
            circle1.ry = circle1.ry + circle1.vy;
            
            circle2.rx = circle2.rx + circle2.vx; 
            circle2.ry = circle2.ry + circle2.vy;

          
            StdDraw.setPenColor(StdDraw.BLACK); 
            StdDraw.filledCircle(circle1.rx, circle1.ry, radius);
            StdDraw.filledCircle(circle2.rx, circle2.ry, radius); 
            StdDraw.text(.015, .023, "'How many times these balls have been hitted each other: "+ Batebate +"'");
            
            StdDraw.show(20);

        }
        
    }
    
    public static Color randomColor() {
        Random rand = new Random();
        
        int r = rand.nextInt(255 + 1);
        int g = rand.nextInt(255 + 1);
        int b = rand.nextInt(255 + 1);
        
        return new Color(r,g,b);
    } 
}
