package beans;

public class Configuracion {

	private String usuario;
	private int horaInicioJornada;
	private int horaFinalJornada;
	private int duracionConsulta;
	
	public Configuracion(){
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getHoraInicioJornada() {
		return horaInicioJornada;
	}

	public void setHoraInicioJornada(int horaInicioJornada) {
		this.horaInicioJornada = horaInicioJornada;
	}

	public int getHoraFinalJornada() {
		return horaFinalJornada;
	}

	public void setHoraFinalJornada(int horaFinalJornada) {
		this.horaFinalJornada = horaFinalJornada;
	}

	public int getDuracionConsulta() {
		return duracionConsulta;
	}

	public void setDuracionConsulta(int duracionConsulta) {
		this.duracionConsulta = duracionConsulta;
	}
	
	
}
