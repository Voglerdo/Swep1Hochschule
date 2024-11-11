package swepb2;

import zeichnungen.zeichnungen.Dreieck;
import zeichnungen.zeichnungen.Kreis;
import zeichnungen.zeichnungen.Linie;
import zeichnungen.zeichnungen.Quadrat;

public class Schneemann {
	public static void main(String[] args) {
	        Kreis koerper = new Kreis();
	        koerper.farbeAendern("lila");
	        koerper.groesseAendern(200);
	        koerper.horizontalBewegen(10);
	        koerper.vertikalBewegen(190);
	        koerper.sichtbarMachen();

	        Kreis knopf1 = new Kreis();
	        knopf1.farbeAendern("gruen");
	        knopf1.groesseAendern(20);
	        knopf1.horizontalBewegen(100);
	        knopf1.vertikalBewegen(230);
	        knopf1.sichtbarMachen();

	        Kreis knopf2 = new Kreis();
	        knopf2.farbeAendern("gruen");
	        knopf2.groesseAendern(20);
	        knopf2.horizontalBewegen(100);
	        knopf2.vertikalBewegen(280);
	        knopf2.sichtbarMachen();

	        Kreis knopf3 = new Kreis();
	        knopf3.farbeAendern("gruen");
	        knopf3.groesseAendern(20);
	        knopf3.horizontalBewegen(100);
	        knopf3.vertikalBewegen(330);
	        knopf3.sichtbarMachen();

	        Linie armLinks = new Linie();
	        armLinks.farbeAendern("schwarz");
	        armLinks.setzePunkt1(170,270);
	        armLinks.setzePunkt2(255,330);
	        armLinks.sichtbarMachen();

	        Linie armRechts = new Linie();
	        armRechts.farbeAendern("schwarz");
	        armRechts.setzePunkt1(425,330);
	        armRechts.setzePunkt2(510,300);
	        armRechts.sichtbarMachen();

	        Linie beinRechts = new Linie();
	        beinRechts.farbeAendern("schwarz");
	        beinRechts.setzePunkt1(425,430);
	        beinRechts.setzePunkt2(510,490);
	        beinRechts.sichtbarMachen();

	        Linie beinLinks = new Linie();
	        beinLinks.farbeAendern("schwarz");
	        beinLinks.setzePunkt1(170,490);
	        beinLinks.setzePunkt2(255,430);
	        beinLinks.sichtbarMachen();

	        Kreis kopf = new Kreis();
	        kopf.farbeAendern("blau");
	        kopf.horizontalBewegen(60);
	        kopf.vertikalBewegen(90);
	        kopf.groesseAendern(100);
	        kopf.sichtbarMachen();

	        Kreis augeLinks = new Kreis();
	        augeLinks.farbeAendern("gelb");
	        augeLinks.groesseAendern(20);
	        augeLinks.horizontalBewegen(80);
	        augeLinks.vertikalBewegen(120);
	        augeLinks.sichtbarMachen();

	        Kreis augeRechts = new Kreis();
	        augeRechts.farbeAendern("gelb");
	        augeRechts.groesseAendern(20);
	        augeRechts.horizontalBewegen(120);
	        augeRechts.vertikalBewegen(120);
	        augeRechts.sichtbarMachen();

	        Dreieck nase = new Dreieck();
	        nase.farbeAendern("gelb");
	        nase.groesseAendern(20,20);
	        nase.horizontalBewegen(130);
	        nase.vertikalBewegen(90);
	        nase.sichtbarMachen();

	        Linie mund = new Linie();
	        mund.farbeAendern("gelb");
	        mund.setzePunkt1(320,260);
	        mund.setzePunkt2(360,260);
	        mund.sichtbarMachen();

	        Quadrat q = new Quadrat();
	        q.sichtbarMachen();

	        Linie l = new Linie();
	        l.farbeAendern("rot");
	        l.sichtbarMachen();
	        l.setzePunkt1(260,180);
	        l.setzePunkt2(410,180);
	}
}