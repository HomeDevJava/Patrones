package AbstractFactoryPattern;

/*a diferencia del patron de fabrica, cuando se utiliza el patron fabrica abstracta, la fabrica normal 
 * implementa la interfaz fabricaAbstracta y devuelve el tipo de interfaz de la fabrica que se requiere*/

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		if(motor == null)
			System.out.println("No se ha especificado motor BD");
		if(motor.equalsIgnoreCase("MYSQL"))
			return new ConexionMysql();
		else if(motor.equalsIgnoreCase("ORACLE"))
			return new ConexionOracle();
		else if(motor.equalsIgnoreCase("SQL"))
			return new ConexionSQLServer();
		
		return null;	
	}

	@Override
	public IConexionREST getREST(String area) {		
		return null;
	}
}