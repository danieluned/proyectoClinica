package dao;

import java.sql.ResultSet;
import java.util.ArrayList;




import beans.Usuario;
import db.DBFacade;

public class DAOMysqlUsuario implements InterfazDAOUsuario {

	private DBFacade db = null;
	public DAOMysqlUsuario() throws Exception {
		try {
			db = new DBFacade();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error creando DBDacade");
		}
	}
	
	@Override
	public Usuario verificarUsuario(Usuario usuario) throws Exception {
		Usuario user =null;
		
		try{
			db.abrirConexion();
			String sql =  "select * from usuario where usuario like and password like '"+usuario.getPassword()+"';";
			System.out.println(sql);
			ResultSet rs = db.ejecutarConsulta(sql);
			while (rs.next()){
				user = new Usuario();
				user.setLogin(rs.getString("login"));
				user.setPassword(rs.getString("password"));
				
			}
		}catch (Exception e){
			System.out.println("Error verificando el usuario");
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
	public boolean insertarUsuario(Usuario usuario) throws Exception {
		boolean correcto = false;
		try{
			db.abrirConexion();
			String sql =  "insert into usuario (usuario,password,jsonConfi) values ("+
					
					 "'"+usuario.getPassword()+"'"+","+
					
					 ");";
			if (db.ejecutarUpdate(sql)>0){
				correcto = true;
				 db.commit();
			}
		 
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			
		}
		finally {
			try{
				db.cerrarConexion();
			}catch (Exception e1){
				System.out.println(e1.getMessage());
				
			}
		}
		return correcto;
	}

	@Override
	public Usuario verificarUsuario(String usuario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
