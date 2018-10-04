package CommandPattern;

//Paso 3.- Crear clases concretas implementando la interfaz IOperacion
public class RetirarImpl implements IOperacion {
	private Cuenta cuenta;
	private double monto;
	
	public RetirarImpl(Cuenta cuenta, double monto) {
		super();
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.cuenta.retirar(this.monto);		
	}
}
