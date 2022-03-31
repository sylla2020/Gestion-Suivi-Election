/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestion.election.methodes;
import gestion.election.bdconnexion.*;
import gestion.election.model.Resultat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author fallou
 */
public class Fonctions {
    // date premier contamination par Pays
	public String date_election(String circonscription) {
	String date_election=null ;
        Connection conn=null;
        PreparedStatement preparestatement=null;
        conn = BdConnexion.connecterdb();
		try {
           preparestatement = conn.prepareStatement("SELECT * FROM circonscription WHERE nom = ? ");
           preparestatement.setString(1, circonscription);
           ResultSet rs = preparestatement.executeQuery();
            while ( rs.next() ) {
                 //System.out.println(rs.getString(0));
                String nom= rs.getDate("date_election").toString();
               date_election=nom;  
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
                return date_election;
	}
        
      //  cas de contamination du jour precedent par Pays
	public Resultat infos_vote(String circonscription) {
			
		Resultat  infos = new Resultat();
			
			PreparedStatement preparestatement=null;
			Connection conn=null;
			
			 conn = BdConnexion.connecterdb();
			try {
				 preparestatement = conn.prepareStatement("SELECT * FROM vote a  JOIN faire_un_communique b ON a.NumeroCommunique=b.NumeroCommunique where b.nom_Pays= ? ORDER BY a.jour LIMIT 2");
				 preparestatement.setString(1, circonscription);
				
				 
				ResultSet resultat = preparestatement.executeQuery();
				
				while(resultat.next()) {
					
					String jour = resultat.getString("jour");
					int numCommunique = resultat.getInt("NumeroCommunique");
                    int cas_confirme = resultat.getInt ("nbre_cas_confirmes");
					int cas_contact = resultat.getInt ("nbre_cas_contact");
					int cas_importe = resultat.getInt ("nbre_cas_impore");
					int nbre_deces = resultat.getInt ("nbre_deces");
					int nbre_gueris = resultat.getInt ("nbre_gueris");
					
				infos = new Resultat();
                                        
					
				}
		        
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return infos;
		}
        
         //  Total contamines depuis le debut de la pandemie par Pays
        
            public String TotalvoteInvalide(String circonscription) {
			PreparedStatement preparestatement=null;
			Connection conn=null;
            String total=null;
			 conn = BdConnexion.connecterdb();
		
			try {
				 preparestatement = conn.prepareStatement("SELECT SUM(nbre_vote) AS votes from communiquemaladescovid a JOIN faire_un_communique b ON a.NumeroCommunique=b.NumeroCommunique where b.nom_Pays = ? ");
				
				 preparestatement.setString(1, circonscription);
				 
				ResultSet resultat = preparestatement.executeQuery();
                                
				while(resultat.next()) {
                                    total=resultat.getString(1);
                                    
                }
				
		
		        
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return total;
		}
             
      // Total guerris 
             
             public String TotalvoteValide(String pays) {
			
	
			
			PreparedStatement preparestatement=null;
			Connection conn=null;
                        String total=null;
			
			 conn = BdConnexion.connecterdb();
			
		
			try {
				 preparestatement = conn.prepareStatement("SELECT SUM(nbre_gueris) AS Total_Contamines from communiquemaladescovid a JOIN faire_un_communique b ON a.NumeroCommunique=b.NumeroCommunique where b.nom_Pays = ? ");
				
				 preparestatement.setString(1, pays);
				 
				ResultSet resultat = preparestatement.executeQuery();
                                
				while(resultat.next()) {
                                    total=resultat.getString(1);
                                    
                                }
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return total;
		}
   
             // Courbe evolution de la maladie
             
             public ArrayList<Resultat> Donnees_circonscription(String pays) {
		
            	 Resultat  infos = new Resultat();
		PreparedStatement p2 = null;
		ArrayList<Resultat> resutl = new  ArrayList<Resultat>();
		
		
		PreparedStatement preparestatement=null;
			Connection conn=null;
                        
			
			 conn = BdConnexion.connecterdb();
		
		
		try {
			 preparestatement = conn.prepareStatement("SELECT * from communiquemaladescovid a JOIN faire_un_communique b ON a.NumeroCommunique=b.NumeroCommunique where b.nom_Pays = ? ");
			 preparestatement.setString(1, pays);
			 ResultSet resultat = preparestatement.executeQuery();
			
			 while (resultat.next ()) {
				 
			                String nom_pays = resultat.getString("nom_Pays");
					String jour = resultat.getString("jour");
					int numCommunique = resultat.getInt("NumeroCommunique");
                                        int cas_confirme = resultat.getInt ("nbre_cas_confirmes");
					int cas_contact = resultat.getInt ("nbre_cas_contact");
					int cas_importe = resultat.getInt ("nbre_cas_impore");
					int nbre_deces = resultat.getInt ("nbre_deces");
					int nbre_gueris = resultat.getInt ("nbre_gueris");
					
					infos = new Resultat( );
			        resutl.add(infos);
			        
			}
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resutl;
			}
             
  
    public void insert(){     
   try { 
            Connection conn=null;
		conn = BdConnexion.connecterdb();
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO continent " + 
                "VALUES ( 'Simpson')"); 
            conn.close(); 
       } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
 }

	public String[] Diagramme_evolution(String pays) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
   
