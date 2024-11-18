package swepb2;

import zeichnungen.zeichnungen.Dreieck;
import zeichnungen.zeichnungen.Quadrat;

public class DachDecker {
	public static void main(String[] args) {
		Quadrat q = new Quadrat();
		q.farbeAendern("blau");
		q.sichtbarMachen();
		q.vertikalBewegen(80);
		
		Dreieck d = new Dreieck(); 
		d.farbeAendern("rot");
		d.sichtbarMachen();
		d.horizontalBewegen(130);
	}
}
