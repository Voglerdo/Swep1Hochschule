package swepa10;

public class Formeln {
	// --- Iterative Methoden ---

    // Iterative Berechnung von f(n)
    public static long berechneFIterativ(int n) {
        long summe = 0;
        for (int i = 3; i <= n; i++) {
            summe += (long) i * i * i - (long) i * i + i;
        }
        return summe;
    }

    // Iterative Berechnung von g(n)
    public static double berechneGIterativ(int n) {
        double produkt = 1.0;
        for (int i = 1; i <= n; i++) {
            produkt *= (double) i / (i + 1);
        }
        return produkt;
    }

    // --- Rekursive Methoden ---

    // Rekursive Berechnung von f(n)
    public static long berechneFRekursiv(int n) {
        if (n < 3) {
            return 0; 
        }
        return (long) n * n * n - (long) n * n + n + berechneFRekursiv(n - 1);
    }

    // Rekursive Berechnung von g(n)
    public static double berechneGRekursiv(int n) {
        if (n == 0) {
            return 1.0; 
        }
        return ((double) n / (n + 1)) * berechneGRekursiv(n - 1);
    }

    public static void main(String[] args) {
        int nF = 20; 
        int nG = 19; 

        // --- Iterative Berechnung ---
        long ergebnisFIterativ = berechneFIterativ(nF);
        double ergebnisGIterativ = berechneGIterativ(nG);

        // --- Rekursive Berechnung ---
        long ergebnisFRekursiv = berechneFRekursiv(nF);
        double ergebnisGRekursiv = berechneGRekursiv(nG);

        // --- Ausgabe der Ergebnisse ---
        System.out.println("Iterative Ergebnisse:");
        System.out.println("f(" + nF + ") = " + ergebnisFIterativ);
        System.out.println("g(" + nG + ") = " + ergebnisGIterativ);

        System.out.println("\nRekursive Ergebnisse:");
        System.out.println("f(" + nF + ") = " + ergebnisFRekursiv);
        System.out.println("g(" + nG + ") = " + ergebnisGRekursiv);
    }
}
