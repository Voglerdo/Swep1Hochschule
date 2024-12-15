package swepa10;

public class AufgabeP10_2 {

    // Iterative Berechnung von g(n) ohne Produktzeichen
    public static double berechneGOhneProduktIterativ(int n) {
        return 1.0 / (n + 1);
    }

    // Rekursive Berechnung von g(n) ohne Produktzeichen
    public static double berechneGOhneProduktRekursiv(int n) {
        if (n == 0) {
            return 1.0; // Abbruchbedingung
        }
        return 1.0 / (n + 1);
    }

    public static void main(String[] args) {
        int n = 19; // Wert für g(n)

        // Iterative Berechnung ohne Produktzeichen
        double ergebnisIterativ = berechneGOhneProduktIterativ(n);
        System.out.println("Iterative Berechnung von g(" + n + ") ohne Produktzeichen: " + ergebnisIterativ);

        // Rekursive Berechnung ohne Produktzeichen
        double ergebnisRekursiv = berechneGOhneProduktRekursiv(n);
        System.out.println("Rekursive Berechnung von g(" + n + ") ohne Produktzeichen: " + ergebnisRekursiv);
    }
}
