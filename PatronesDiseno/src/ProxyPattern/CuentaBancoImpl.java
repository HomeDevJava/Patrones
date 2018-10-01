package ProxyPattern;

public class CuentaBancoImpl implements ICuenta {

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual= cuenta.getSaldoinicial()-monto;
		cuenta.setSaldoinicial(saldoActual);
		System.out.println("Saldo actual: "+ cuenta.getSaldoinicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual= cuenta.getSaldoinicial()+monto;
		cuenta.setSaldoinicial(saldoActual);
		System.out.println("Saldo actual: "+ cuenta.getSaldoinicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual: "+ cuenta.getSaldoinicial());
	}

}
