/*
  * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestion.election.webservice;

import gestion.election.methodes.*;
import gestion.election.model.Resultat;

import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Mame Cheikh Sylla
 */
@WebServlet(name = "WebServices")
public class WebServices {

   
    @WebMethod( operationName="Date_Election" )
	public String getDate_election( @WebParam(name ="circonscription") String circonscription ) {
	
		String date_election = new Fonctions().date_election(circonscription);
		
		return date_election;
	}
     
    
	@WebMethod(operationName="Nombre_Voi_null-valide")
	public String ResultatCirconscription( @WebParam(name="circonscription")String circonscription ) {
		
		Resultat infos =new Fonctions().infos_vote(circonscription);
		
		return "Nombres de Bulletin Valide : "+ infos.getNbre_voi_valide()+ " Nombres de Bulletin Null : "+ infos.getNbre_voi_nule();
	}
	
	   @WebMethod(operationName="Total_vote_coalition_GuemSaBOOP")
		public String Resultat_liste_GuemSaBOOP( @WebParam(name="circonscription")String circonscription ) {
			
			Resultat infos =new Fonctions().infos_vote(circonscription);
			
			return "Nombres de vois Guem Sa BOOP : "+ infos.getNbre_votant();
		}
        @WebMethod(operationName="Total_vote_coalition_APR")
	public String Resultat_liste_Apr( @WebParam(name="circonscription")String circonscription ) {
		
		Resultat infos =new Fonctions().infos_vote(circonscription);
		
		return "Nombres de vois APR : "+ infos.getNbre_votant();
	}
        
        @WebMethod(operationName="Total_vote_coalition_Yewwi")
    	public String Resultat_liste_Yewwi( @WebParam(name="circonscription")String circonscription ) {
    		
    		Resultat infos =new Fonctions().infos_vote(circonscription);
    		
    		return "Nombres de vois Yewwi : "+ infos.getNbre_votant();
    	}
        @WebMethod(operationName="Total des vote Null")
	public String TotalvoteInvalide( @WebParam(name="pays")String pays ) {
		
		String total =new Fonctions().TotalvoteInvalide(pays);
		
		return "Total des votes null : "+ total;
	}
        
        
         @WebMethod(operationName="Total des vote valablement Exprimer")
	public String TotalvoteValide( @WebParam(name="pays")String pays ) {
		
		String total =new Fonctions().TotalvoteValide(pays);
		
		return "Total des votes valider : "+ total;
	}
        
}
    