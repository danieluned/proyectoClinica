package beans;

public class Usuario {
	private String login;
	private String password;
	private String tipo;
	private String nombre;
	private String fechaNacimiento;
	private int clinica;
	
	public Usuario(){
	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getClinica() {
		return clinica;
	}

	public void setClinica(int clinica) {
		this.clinica = clinica;
	}
	
}
