package uebungen3A;

public class Multiply {
    public static void main(String[] args) {
        System.out.println("Guten Tag! Hier werden zwei Zahlen multipliziert.");
        int first = InputTools.readInteger("Bitte Zahl 1 eingeben:");
        int second = InputTools.readInteger("Bitte Zahl 2 eingeben:");
        System.out.println("Das Ergebnis von " + first + " * " + second + " = " + (first * second));
    }
}