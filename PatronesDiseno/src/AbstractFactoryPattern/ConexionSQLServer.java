package AbstractFactoryPattern;

public class ConexionSQLServer implements IConexionBD {
	private String host;
	private String puerto;
	private String usuario;
	private String psw;
	
	public ConexionSQLServer() {
		this.setHost("localhost");
		this.setPuerto("1433");
		this.setUsuario("sa");
		this.setPsw("123");		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a SQL Server");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto a SQL Server");
	}

	public String getHost() {return host;}
	public void setHost(String host) {this.host = host;}
	public String getPuerto() {return puerto;}
	public void setPuerto(String puerto) {this.puerto = puerto;}
	public String getUsuario() {return usuario;}
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public String getPsw() {return psw;}
	public void setPsw(String psw) {this.psw = psw;}

}
