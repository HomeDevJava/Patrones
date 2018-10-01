package ProxyPattern;

public class Cuenta {

	private int idcuenta;
	private String usuario;
	private double saldoinicial;
	
	public Cuenta(int idcuenta, String usuario, double saldoinicial) {
		super();
		this.idcuenta = idcuenta;
		this.usuario = usuario;
		this.saldoinicial = saldoinicial;
	}

	public int getIdcuenta() {
		return idcuenta;
	}

	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldoinicial() {
		return saldoinicial;
	}

	public void setSaldoinicial(double saldoinicial) {
		this.saldoinicial = saldoinicial;
	}
	
	
}
