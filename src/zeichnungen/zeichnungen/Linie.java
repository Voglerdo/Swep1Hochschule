package zeichnungen.zeichnungen ;

import java.awt.geom.Line2D;

/**
 * Eine Linie, die manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Georg Hagel
 * @version 27.09.2015
 */

public class Linie {
    private int x1Position;
    private int y1Position;
    private int x2Position;
    private int y2Position;
    private String farbe;
    private boolean istSichtbar;

    /**
     * Erzeuge ein neues Quadrat mit einer Standardfarbe an einer
     * Standardposition.
     */
    public Linie() {
        
    	x1Position = 310;
        y1Position = 120;
        x2Position = 330;
        y2Position = 150;
        farbe = "blau";
        istSichtbar = false;
    }
    
    /**
     * Setze Koordinaten von Punkt 1, x1 und y1.
     */
    public void setzePunkt1(int x1, int y1) {
        x1Position = x1;
        y1Position = y1;
        zeichnen();
    }
    
    /**
     * Setze Koordinaten von Punkt 2, x2 und y2.
     */
    public void setzePunkt2(int x2, int y2) {
        x2Position = x2;
        y2Position = y2;
        zeichnen();
    }
    
    /**
     * Mache diese Linie sichtbar. Wenn sie bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache diese Linie unsichtbar. Wenn sie bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege diese Linie horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) {
        loeschen();
        x1Position += entfernung;
        x2Position += entfernung;
        zeichnen();
    }
    
    /**
     * Bewege diese Linie vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        y1Position += entfernung;
        y2Position += entfernung;
        zeichnen();
    }
    
    /**
     * �ndere die Farbe dieser Linie in 'neueFarbe'. G�ltige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }
    
    /**
     * F�r Linien ist die Gr��en�nderung nicht programmiert.
     */
    public void groesseAendern(int neueGroesse) {
        System.out.println("Nicht implementiert.");
    }

    
    /**
     * Zeichne diese Linie mit ihren aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Line2D.Double(x1Position,
                    y1Position, x2Position, y2Position));
            leinwand.warte(10);
        }
    }

    /**
     * L�sche diesee Linie vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }

}
