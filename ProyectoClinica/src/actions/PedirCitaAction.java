/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import beans.Usuario;

import com.opensymphony.xwork2.ActionSupport;

import dao.FactoriaDAO;
/**
 * Clase LoginAction
 * Esta clase es llamada cuando se logea un usuario,
 * comprueba con la base de datos si el usuario esta autentificado
 * y entonces lo autoriza en el sistema mediante una inserción de sus datos en la session
 * @author alumno
 *
 */
public class PedirCitaAction extends ActionSupport {
	
	private ArrayList<Usuario> medicos = new ArrayList<Usuario>();
	
	

	public String execute() throws Exception {
		medicos = FactoriaDAO.obtenerDAO("MySql").listaUsuarios();
		return "success";
	}



	public ArrayList<Usuario> getMedicos() {
		return medicos;
	}



	public void setMedicos(ArrayList<Usuario> medicos) {
		this.medicos = medicos;
	}
	
}