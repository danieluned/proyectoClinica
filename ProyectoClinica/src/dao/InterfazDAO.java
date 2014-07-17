package dao;


import java.util.ArrayList;

import beans.Cita;
import beans.Clinica;
import beans.Usuario;

public interface InterfazDAO {
	public ArrayList<Usuario> listaUsuarios()throws Exception;
	public ArrayList<Clinica> listaClinicas()throws Exception;
	public Usuario obtenerUsuario(String login, String password) throws Exception;
}
