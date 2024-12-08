package swep9b;

public class Main1 {
    public static void main(String[] args) {
        // Rechteck erstellen und Attribute setzen
        Rechteck r = new Rechteck();
        r.setBreite(10);
        r.setHoehe(20);
        r.setReferenzpunkt(new Referenzpunkt(5, 5)); // Referenzpunkt-Objekt setzen
        System.out.println(r);

        // Kreis erstellen und Attribute setzen
        Kreis k = new Kreis();
        k.setRadius(5);
        k.setReferenzpunkt(new Referenzpunkt(10, 10)); // Referenzpunkt-Objekt setzen
        System.out.println(k);
    }
}
