package AbstractFactoryPattern;

/*a diferencia del patron de fabrica, cuando se utiliza el patron fabrica abstracta, la fabrica normal 
 * implementa la interfaz fabricaAbstracta y devuelve el tipo de interfaz de la fabrica que se requiere*/

public class ConexionBDFabrica extends FabricaAbstracta {

	@Override
	IConexionBD getBD(String motor) {
		if (motor == null)
			System.out.println("No se ha especificado motor BD");
		if (motor.equalsIgnoreCase("MYSQL"))
			return ConexionMysql.getInstance();
		else if (motor.equalsIgnoreCase("ORACLE"))
			return new ConexionOracle();
		else if (motor.equalsIgnoreCase("SQL"))
			return ConexionSQLServer.getInstance();

		return null;
	}

	@Override
	IConexionREST getREST(String area) {
		// TODO Auto-generated method stub
		return null;
	}

}