package ProxyPattern;

import java.util.logging.Logger;

public class CuentaProxy implements ICuenta {
	
	/*las ventajas de utilizar un proxy es que podemos agregar alguna funcionalidad 
	 * extra sin alterar la clase Base
	 * 
	 * se puede amarrar la clase CuentaProxy a una clase de Implementacion pero tambien se puede enchufar
	 * a una interface y hacer un proxy mas flexible
	 * 
	 */
	
	//private CuentaBancoImpl cuentaReal;
	private ICuenta cuentaReal;
	private final static Logger LOGGER= Logger.getLogger(CuentaProxy.class.getName());

	
	
	public CuentaProxy(ICuenta cuentaReal) {
		super();
		this.cuentaReal = cuentaReal;
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("---Cuenta Proxy- Retirar Dinero---");
		if(cuentaReal == null) {
			cuentaReal= new CuentaBancoImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		}else
			return cuentaReal.retirarDinero(cuenta, monto);
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("---Cuenta Proxy- Depositar Dinero---");
		if(cuentaReal == null) {
			cuentaReal= new CuentaBancoImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		}else
			return cuentaReal.depositarDinero(cuenta, monto);
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		LOGGER.info("---Cuenta Proxy- Mostrar Saldo---");
		if(cuentaReal == null) {
			cuentaReal= new CuentaBancoImpl();
			cuentaReal.mostrarSaldo(cuenta);
		}else
			cuentaReal.mostrarSaldo(cuenta);
	}

}
