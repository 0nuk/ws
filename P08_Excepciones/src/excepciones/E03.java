package excepciones;

import java.io.IOException;
import java.sql.SQLException;

public class E03 {	
	public static void main(String[] args)  {
		try {
			metodoProblematico();
		}catch (IOException | SQLException e){
			
		}
//		}catch(SQLException e){
//			
//		}
	}

	
	public static void metodoProblematico() throws IOException, SQLException {
		
	}
}
