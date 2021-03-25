package AbstractFactoryPattern;

public abstract class FabricaAbstracta {
	
	abstract IConexionBD getBD(String motor);
	abstract IConexionREST getREST(String area);

}
