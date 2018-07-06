package AbstractFactoryPattern;

public class ConexionRESTCompras implements IConexionREST {

	@Override
	public void leerURL(String url) {
		// TODO Auto-generated method stub
		System.out.println("Conectandose a compras: " +url);

	}

}
