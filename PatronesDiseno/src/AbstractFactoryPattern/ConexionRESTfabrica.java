package AbstractFactoryPattern;

public class ConexionRESTfabrica extends FabricaAbstracta{

	@Override
	IConexionBD getBD(String motor) {
		return null;
	}

	@Override
	IConexionREST getREST(String area) {
		if(area == null)
			System.out.println("No se ha especificado motor BD");
		if(area.equalsIgnoreCase("COMPRAS"))
			return new ConexionRESTCompras();
		else if(area.equalsIgnoreCase("VENTAS"))
			return new ConexionRESTventas();		
		
		return null;	
	}

}
