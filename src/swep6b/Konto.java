package swep6b;

public class Konto {
	private int kontoNr;
	private int saldo;

	
	public void einzahlen(int einzahlung, int kontoNr) {
		if (this.kontoNr == kontoNr) {
		saldo = saldo + einzahlung;
		}
	}
	public int auszahlen(int betrag) {
		if(betrag<saldo) {
		saldo = saldo - betrag;
		return betrag; 
	}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Konto [kontoNr=" + kontoNr + ", saldo=" + saldo + "]";
	}
	public int getKontoNr() {
		return kontoNr;
	}
	public void setKontoNr(int kontoNr) {
		this.kontoNr = kontoNr;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Konto(int kontoNr, int saldo) {
		super();
		this.kontoNr = kontoNr;
		this.saldo = saldo;
	}
	public Konto() {
		super();
	}
	
}