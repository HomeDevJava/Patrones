package AbstractFactoryPattern;

public class ConexionRESTfabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}

	@Override
	public IConexionREST getREST(String area) {
		if(area == null)
			System.out.println("No se ha especificado motor BD");
		if(area.equalsIgnoreCase("COMPRAS"))
			return new ConexionRESTCompras();
		else if(area.equalsIgnoreCase("VENTAS"))
			return new ConexionRESTventas();		
		
		return null;	
	}

}
