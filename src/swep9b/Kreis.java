package swep9b;

public class Kreis extends Figur {


	private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}