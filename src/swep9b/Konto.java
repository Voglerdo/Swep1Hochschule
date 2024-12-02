package swep9b;

public class Konto implements IWert{
	public Konto(int saldo) {
		super();
		this.saldo = saldo;
	}

	private int saldo;
	
	public int gibWert() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Konto [saldo=" + saldo + "]";
	}

}
