package DecoratorPattern;

public class CuentaCorriente implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("---------------------");
		System.out.println("Se abrio una cuenta de Corriente");
		System.out.println("Cliente: "+ c.getId());

	}

}
