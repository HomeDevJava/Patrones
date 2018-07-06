package AbstractFactoryPattern;

public class FabricaProductora {
	
	public static FabricaAbstracta getFactory(String fabrica) {
		
		if(fabrica.equalsIgnoreCase("BD")) {
			return new ConexionBDFabrica();
		}else if(fabrica.equalsIgnoreCase("REST"))
			return new ConexionRESTfabrica();
		
		return null;		
	}

}
