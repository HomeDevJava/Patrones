package AbstractFactoryPattern;

public class AbstractFactoryImpl {

	public static void main(String[] args) {
		
		FabricaAbstracta fabricaBD=FabricaProductora.getFactory("BD");
		IConexionBD cxBD1= fabricaBD.getBD("SQL");		
		cxBD1.conectar();
				
		FabricaAbstracta fabricaREST= FabricaProductora.getFactory("REST");
		IConexionREST cxRS1=fabricaREST.getREST("VENTAS");
		cxRS1.leerURL("https://www.tutorialspont.com");

	}

}
