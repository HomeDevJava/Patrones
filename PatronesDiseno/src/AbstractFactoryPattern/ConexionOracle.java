package AbstractFactoryPattern;

public class ConexionOracle implements IConexionBD {
	
	private String host;
	private String puerto;
	private String usuario;
	private String psw;
	
	public ConexionOracle() {
		this.setHost("localhost");
		this.setPuerto("1521");
		this.setUsuario("admin");
		this.setPsw("123");		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto a Oracle");
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