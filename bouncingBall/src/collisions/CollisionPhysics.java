package collisions;

public class CollisionPhysics {
    private static CollisionResponse temp = new CollisionResponse();

    //Define a física da bola quando ela colide com os limites do retangulo
    public static void pointIntersectsRectangleOuter(
         float pointX, float pointY, float speedX, float speedY, float radius,
         float rectX1, float rectY1, float rectX2, float rectY2,
         float timeLimit, CollisionResponse response) {
      
      response.reset();  
     
       
      pointIntersectsLineVertical(pointX, pointY, speedX, speedY, radius,
            rectX2, timeLimit, temp); {
                if (temp.time < response.time) {
                response.copy(temp);  
             }
            }
      
      
      pointIntersectsLineVertical(pointX, pointY, speedX, speedY, radius,
            rectX1, timeLimit, temp);
      if (temp.time < response.time) {
         response.copy(temp);
      }
      
      pointIntersectsLineHorizontal(pointX, pointY, speedX, speedY, radius,
            rectY1, timeLimit, temp);
      if (temp.time < response.time) {
         response.copy(temp);
      }
 
      pointIntersectsLineHorizontal(pointX, pointY, speedX, speedY, radius,
            rectY2, timeLimit, temp);
      if (temp.time < response.time) {
         response.copy(temp);
      }
   }

   public static void pointIntersectsLineVertical(
         float pointX, float pointY, float speedX, float speedY, float radius,
         float lineX, float timeLimit, CollisionResponse response) {
  
      response.reset();  
  
      
      if (speedX == 0) {
         return;
      }
  
      
      float distance;
      if (lineX > pointX) {
         distance = lineX - pointX - radius; 
      } else {
         distance = lineX - pointX + radius; 
      }
      
      float t = distance / speedX;  
      if (t > 0 && t <= timeLimit) {
         response.time = t;
         response.newSpeedX = -speedX;  
         response.newSpeedY = speedY;   
      }
   }
  

   public static void pointIntersectsLineHorizontal(
         float pointX, float pointY, float speedX, float speedY, float radius,
         float lineY, float timeLimit, CollisionResponse response) {

      response.reset();  
  
      
      if (speedY == 0) {
         return;
      }
  
      
      float distance;
      if (lineY > pointY) {
         distance = lineY - pointY - radius; 
      } else {
         distance = lineY - pointY + radius; 
      }
      
      float t = distance / speedY;  
      if (t > 0 && t <= timeLimit) {
         response.time = t;
         response.newSpeedY = -speedY; 
         response.newSpeedX = speedX;   
      }
   }
}
