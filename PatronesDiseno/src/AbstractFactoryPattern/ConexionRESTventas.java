package AbstractFactoryPattern;

public class ConexionRESTventas implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("Conectandose a ventas: "+url);

	}

}
