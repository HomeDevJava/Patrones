package ProxyPattern;

public class App {
	
	//en resumen el proxy viene a ser un intermediario entre el cliente y el objeto final o destino

	public static void main(String[] args) {
		
		Cuenta c= new Cuenta(1, "sakuragui", 100);
		
		//se declara la interface y se agrega la clase implementacion CuentaBancoImplB o CuentaBancoImpl
		ICuenta cuentaProxy= new CuentaProxy(new CuentaBancoImplB());
		cuentaProxy.mostrarSaldo(c);
		c=cuentaProxy.depositarDinero(c, 50);
		c=cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);

	}

}
