package dao;

import java.sql.ResultSet;
import java.util.ArrayList;





import beans.Clinica;
import beans.Usuario;
import db.DBFacade;

public class DAOMysql implements InterfazDAO {

	private DBFacade db = null;
	public DAOMysql() throws Exception {
		try {
			db = new DBFacade();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error creando DBDacade");
		}
	}
	
	@Override
	public Usuario obtenerUsuario(String login, String password) throws Exception {
		Usuario user =null;
		
		try{
			db.abrirConexion();
			String sql =  "select * from usuario where login like '"+login+"' and password like '"+password+"';";
			System.out.println(sql);
			ResultSet rs = db.ejecutarConsulta(sql);
			while (rs.next()){
				user = new Usuario();
				user.setLogin(rs.getString("login"));
				user.setPassword(rs.getString("password"));
				user.setClinica(rs.getString("clinica"));
				user.setFechaNacimiento(rs.getDate("fechaNacimiento"));
				user.setNombre(rs.getString("nombre"));
				user.setTipo(rs.getString("tipo"));
				
			}
		}catch (Exception e){
			System.out.println("Error verificando el usuario: "+e.getMessage());
		}
		finally {
			try{
				
				db.cerrarConexion();
			}catch (Exception e1){
				System.out.println("Error cerrando la conexión");
			}
		}
		return user;
	}


	
	@Override
	public ArrayList<Usuario> listaUsuarios() {
		ArrayList<Usuario> listaUsuarios =new ArrayList<Usuario>();
		
		try{
			db.abrirConexion();
			String sql =  "select * from usuario ;";
			System.out.println(sql);
			ResultSet rs = db.ejecutarConsulta(sql);
			while (rs.next()){
				Usuario user = new Usuario();
				user.setLogin(rs.getString("login"));
				user.setPassword(rs.getString("password"));
				user.setClinica(rs.getString("clinica"));
				user.setFechaNacimiento(rs.getDate("fechaNacimiento"));
				user.setNombre(rs.getString("nombre"));
				user.setTipo(rs.getString("tipo"));
				listaUsuarios.add(user);
			}
		}catch (Exception e){
			System.out.println("Error verificando el usuario: "+e.getMessage());
		}
		finally {
			try{
				
				db.cerrarConexion();
			}catch (Exception e1){
				System.out.println("Error cerrando la conexión");
			}
		}
		return listaUsuarios;
	}

	@Override
	public ArrayList<Clinica> listaClinicas() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
