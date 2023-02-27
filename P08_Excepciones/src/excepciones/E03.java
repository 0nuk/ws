package excepciones;

import java.io.IOException;
import java.sql.SQLException;

public class E03 {	
	public static void main(String[] args)  {
		try {
			metodoProblematico();
		} catch (IOException | SQLException e){
			
		}
//		try {
//		
//		} catch(SQLException e){
//			
//		} catch(IOException e){
//	    
//		}
//		
//		try {
//		
//		} catch(Exception e) {
//	    
//		}
	}

	
	public static void metodoProblematico() throws IOException, SQLException {
		
	}
}
