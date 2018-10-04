package CommandPattern;

public class App {
	
	public static void main(String[] args) {
		
		Cuenta cuenta= new Cuenta(1, 1000);
		
		DepositarImpl opDepositar= new DepositarImpl(cuenta, 500);
		RetirarImpl opRetirar= new RetirarImpl(cuenta, 150);
		
		Invoker ivk= new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}

}
