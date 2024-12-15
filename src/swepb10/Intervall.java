package swepb10;

public class Intervall {

    double links;
    double rechts;

    boolean enthaelt(double x) {
        return x > links && x < rechts;
    }

    boolean schneidet(Intervall b) {
        return (this.links < b.rechts && this.rechts > b.links);
    }

    public static void main(String[] args) {
        Intervall a = new Intervall();
        a.links = 1.0;
        a.rechts = 5.0;

        Intervall b = new Intervall();
        b.links = 4.0;
        b.rechts = 8.0;

        System.out.println(a.schneidet(b));
        Intervall c = new Intervall();
        c.links = 6.0;
        c.rechts = 10.0;

        System.out.println(a.schneidet(c)); 
    }
}
