package dao;

public class FactoriaDAO {
	public static InterfazDAO obtenerDAO (String basededatos) throws Exception{
		if ("MySql".equals(basededatos)){
			return new DAOMysql();
		}else {
			return null;
		}
		
	}
	
	
}
