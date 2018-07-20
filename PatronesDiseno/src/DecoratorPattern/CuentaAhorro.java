package DecoratorPattern;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("---------------------");
		System.out.println("Se abrio una cuenta de Ahorros");
		System.out.println("Cliente: "+ c.getId());

	}

}
