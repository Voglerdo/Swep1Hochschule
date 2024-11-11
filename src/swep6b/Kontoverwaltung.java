package swep6b;

import uebungen3A.InputTools;

public class Kontoverwaltung {
	public static void main(String[] args) {
		Kreditkartenkonto k = new Kreditkartenkonto();
		int inputSaldo = InputTools.readInteger("Geben Sie ein Saldo ein");
		int inputKonto = InputTools.readInteger("geben sie die Kontonummer ein");
		k.setKontoNr(inputKonto);
		k.setSaldo(inputSaldo);
		System.out.println(k);
		
		int inputSaldoGiro = InputTools.readInteger("Geben Sie ein Saldo ein");
		int inputKontoGiro = InputTools.readInteger("geben sie die Kontonummer ein");
		Girokonto g = new Girokonto(inputKontoGiro, inputSaldoGiro);
		System.out.println(g);
		
		int betrag = InputTools.readInteger("geben sie den Betrag für die überweisung an");
		
		g.auszahlen(betrag);
		k.einzahlen(betrag, inputKonto);
		System.out.println(g);
		System.out.println(k);
	}
}
