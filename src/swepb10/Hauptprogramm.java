package swepb10;

import uebungen3A.InputTools;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hauptprogramm {
    public static void main(String args[]) {
        int anzahl = InputTools.readInteger("Wie viele Prüfungen sollen erstellt werden?");

        List<Pruefung> pruefungen = new ArrayList<>(); // Liste zum Speichern der Prüfungen

        while (anzahl > 0) {
            int noteI = InputTools.readInteger("Welche Note?"); 
            float note= noteI;
            String lv = InputTools.readString("Lehrveranstaltung Name?");
            int cp = InputTools.readInteger("Wie viele Creditpoints?");
            Pruefung pruefung = new Pruefung(lv, cp, note);
            pruefungen.add(pruefung); 
            anzahl--;
        }

        pruefungen.sort((p1, p2) -> Float.compare(p1.getNote(), p2.getNote()));

        System.out.println("Sortierte Prüfungen nach Note:");
        for (Pruefung pruefung : pruefungen) {
            System.out.println(pruefung);
        }

        System.out.println("Anzahl Prüfungen: " + Pruefung.getAnzahlInstanzenPruefung());
    }
}
