package AbstractFactoryPattern;

public class ConexionMysql implements IConexionBD {
	
	private String host;
	private String puerto;
	private String usuario;
	private String psw;
	
	public ConexionMysql() {
		this.setHost("localhost");
		this.setPuerto("3306");
		this.setUsuario("root");
		this.setPsw("123");		
	}

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Se conecto a Mysql");

	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconecto de Mysql");

	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

}
