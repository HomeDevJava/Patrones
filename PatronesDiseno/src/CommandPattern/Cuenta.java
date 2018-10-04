package CommandPattern;

//Paso 2.- crear la clase base

public class Cuenta {
	
	private int id;
	private double saldo;
	
	public Cuenta(int id, double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}
	
	public void retirar(double monto) { 
		this.saldo=this.saldo - monto;
		System.out.println("[CMD RETIRAR] Cuenta: " + id + " Saldo: "+this.saldo);
	}

	public void depositar(double monto) { 
		this.saldo=this.saldo + monto;
		System.out.println("[CMD DEPOSITAR] Cuenta: " + id + " Saldo: "+this.saldo);
	}

}