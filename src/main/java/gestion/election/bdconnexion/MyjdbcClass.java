package gestion.election.bdconnexion;
import java.sql.Connection;
import java.sql.DriverManager;
public class  MyjdbcClass {
	static Connection cnx(){
		try{
			String driver ="com.mysql.jdbc.Driver";
			 String url = "jdbc:mysql://localhost:3306/election";
		        String user = "root";
		        String passwd = "";
			Class.forName(driver);
			System.out.println("connection établie");
			return DriverManager.getConnection(url, user, passwd);
		}catch(Exception e){
		System.out.println("connection échouée");
		return null;
		}
	}
	public static void main(String[] args) {
		cnx();
	}	
}