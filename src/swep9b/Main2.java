package swep9b;

import uebungen3A.InputTools;

public class Main2 {
    public static void main(String [] args) {
        int anzahl = InputTools.readInteger("Wie viele Figuren sollen gezeichnet werden?");
        Figur [] figuren = new Figur[anzahl];
        for (int i = 0; i < figuren.length; i++) {
            String art = InputTools.readString("Welche Figur soll gezeichnet werden? (Kreis, Rechteck)");
            switch (art) {
                case "Kreis":
                    Kreis k = new Kreis();
                    k.setRadius(InputTools.readInteger("Radius: "));
                    int x=(InputTools.readInteger("Referenzpunkt x: "));
                    int y=(InputTools.readInteger("Referenzpunkt y"));
                    k.setReferenzpunkt(new Referenzpunkt(x, y));
                    figuren[i] = k;
                    break;
                case "Rechteck":
                    Rechteck r = new Rechteck();
                    r.setBreite(InputTools.readInteger("Breite: "));
                    r.setHoehe(InputTools.readInteger("Höhe: "));
                    x=(InputTools.readInteger("Referenzpunkt x: "));
                    y=(InputTools.readInteger("Referenzpunkt y"));
                    r.setReferenzpunkt(new Referenzpunkt(x, y));
                    figuren[i] = r;
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
            }
        }
        for (Figur f : figuren) {
            System.out.println(f);
        }
    }
} 