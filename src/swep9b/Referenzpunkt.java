package swep9b;

public class Referenzpunkt {
    private int x;
    private int y;

    public Referenzpunkt(int x, int y) {
        setX(x); 
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            throw new InvalidRadiusException("X-Koordinate darf nicht negativ sein: " + x);
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0) {
            throw new InvalidRadiusException("Y-Koordinate darf nicht negativ sein: " + y);
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return "Referenzpunkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
