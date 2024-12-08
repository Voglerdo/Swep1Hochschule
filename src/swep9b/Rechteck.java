package swep9b;


public class Rechteck extends Figur {

	private int breite, hoehe;

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public String toString() {
        return "Rechteck{" +
                "breite=" + breite +
                ", hoehe=" + hoehe +
                "} " + super.toString();
    }
}