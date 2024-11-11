package zeichnungen.zeichnungen ;

public class Programm {

	public static void main(String[] args) {
		// Instanziierung der Objekte und Setzen der Farbe:

		Kreis k = new Kreis();
		k.farbeAendern("gruen");
		k.sichtbarMachen();
		k.horizontalBewegen(80);
		
		Quadrat q = new Quadrat();
		q.farbeAendern("rot");
		q.sichtbarMachen();
		
	
	
	}
}
