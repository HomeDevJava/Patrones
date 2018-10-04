package CommandPattern;

import java.util.ArrayList;
import java.util.List;

//Paso 4.- crear el broker o invocador, responsable de apilar las operaciones y ejecutarlas
public class Invoker {

	private List<IOperacion> operaciones= new ArrayList<>();
	
	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}
	
	public void realizarOperaciones() {
		this.operaciones.forEach(x->x.execute());
		this.operaciones.clear();
	}
}
