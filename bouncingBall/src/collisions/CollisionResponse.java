package collisions;

public class CollisionResponse {
    public float time;
    private static final float T_MIN = 0.005f;
    public float newSpeedX;
    public float newSpeedY;

    //Reseta o tempo para o maior valor possível
    public CollisionResponse() {
        reset();
    }

    public void reset() {
        this.time = Float.MAX_VALUE;
    }

    //Copia o tempo e as novas velocidades para o objeto
    public void copy(CollisionResponse cr) {
        this.time = cr.time;
        this.newSpeedX = cr.newSpeedX;
        this.newSpeedY = cr.newSpeedY;
    }

    //Nova posição X
    public float newX (float currentX, float speedX) {
        if(time > T_MIN) {
            return (float)(currentX + speedX * (time - T_MIN));          
        } else {
            return currentX;
        }
    }

    //Nova posição Y
    public float newY(float currentY, float speedY) {
        if(time > T_MIN) {
            return (float)(currentY + speedY * (time - T_MIN));
        } else {
            return currentY;
        }
    }
}
