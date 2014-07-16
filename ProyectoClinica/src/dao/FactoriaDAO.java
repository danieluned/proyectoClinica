package dao;

public class FactoriaDAO {
	public static InterfazDAOUsuario obtenerDAOUsuario (String basededatos) throws Exception{
		if ("MySql".equals(basededatos)){
			return new DAOMysqlUsuario();
		}else {
			return null;
		}
		
	}
	
	
}
