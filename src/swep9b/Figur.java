package swep9b;

public class Figur {
    private Referenzpunkt referenzpunkt;

    // Standardkonstruktor
    public Figur() {
        this.referenzpunkt = new Referenzpunkt(0, 0); // Standardreferenzpunkt
    }

    // Konstruktor mit x und y
    public Figur(int x, int y) {
        this.referenzpunkt = new Referenzpunkt(x, y);
    }

    public Referenzpunkt getReferenzpunkt() {
        return referenzpunkt;
    }

    public void setReferenzpunkt(Referenzpunkt referenzpunkt) {
        this.referenzpunkt = referenzpunkt;
    }

    @Override
    public String toString() {
        return "Figur{" +
                "referenzpunkt=" + referenzpunkt +
                '}';
    }
}
