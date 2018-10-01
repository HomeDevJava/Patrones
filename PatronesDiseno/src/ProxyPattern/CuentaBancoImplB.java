package ProxyPattern;

public class CuentaBancoImplB implements ICuenta {
	
	/*esta clase es para fin demostrativo 
	similar a la clase CuentaBancoImpl pero agrega .20 a cada deposito*/
	

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual= cuenta.getSaldoinicial()-monto;
		cuenta.setSaldoinicial(saldoActual);
		System.out.println("Saldo actual: "+ cuenta.getSaldoinicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual= cuenta.getSaldoinicial()+monto +0.20;
		cuenta.setSaldoinicial(saldoActual);
		System.out.println("Saldo actual: "+ cuenta.getSaldoinicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual: "+ cuenta.getSaldoinicial());
	}

}
