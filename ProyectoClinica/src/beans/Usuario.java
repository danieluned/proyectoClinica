package beans;

import java.util.Date;

public class Usuario {
	private String login;
	private String password;
	private String tipo;
	private String nombre;
	private Date fechaNacimiento;
	private String clinica;
	
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

	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}
	public String toString(){
		String str = "";
		str += login+"."+clinica+"."+nombre+"."+password+"."+tipo+"."+fechaNacimiento;
		return str;
	}
}
