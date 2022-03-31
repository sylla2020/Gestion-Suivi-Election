package gestion.election.bdconnexion;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 * @author Mame Cheikh Sylla
 */
@Stateless 

public class BdConnexion {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
	Connection conn=null;
	
	public static Connection connecterdb(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/election","root","");
			
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
		
	}
	public static void main(String[] args) {
		connecterdb();
	}
}

