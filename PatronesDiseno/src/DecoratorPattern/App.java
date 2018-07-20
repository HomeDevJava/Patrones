package DecoratorPattern;

public class App {

	public static void main(String[] args) {
		
		Cuenta c= new Cuenta(1, "Abel");		
		ICuentaBancaria cuenta= new CuentaAhorro();
		ICuentaBancaria cuentaBlindada= new BlindajeDecorador(cuenta);
		
		cuentaBlindada.abrirCuenta(c);
		
		Cuenta c2= new Cuenta(2, "Jisashi");		
		ICuentaBancaria cuenta2= new CuentaCorriente();
		ICuentaBancaria cuentaBlindada2= new BlindajeDecorador(cuenta2);
		
		cuentaBlindada2.abrirCuenta(c2);

	}

}
