package gestion.election.model;

/**
 * @author ACER
 *
 */
public class Resultat {
		private String Circonscription;
	    private int num_bureau;
	    private String jour;
	    private int nbre_electeur_inscrite;
	    private int nbre_votant;
	    private int nbre_voi_valide;
	    private int nbre_voi_nule;
	    
		public Resultat(String circonscription, int num_bureau, String jour, int nbre_electeur_inscrite,
				int nbre_votant, int nbre_voi_valide, int nbre_voi_nule) {
			super();
			Circonscription = circonscription;
			this.num_bureau = num_bureau;
			this.jour = jour;
			this.nbre_electeur_inscrite = nbre_electeur_inscrite;
			this.nbre_votant = nbre_votant;
			this.nbre_voi_valide = nbre_voi_valide;
			this.nbre_voi_nule = nbre_voi_nule;
		}
		public Resultat() {
			// TODO Auto-generated constructor stub
		}
		public String getCirconscription() {
			return Circonscription;
		}
		public void setCirconscription(String circonscription) {
			Circonscription = circonscription;
		}
		public int getNum_bureau() {
			return num_bureau;
		}
		public void setNum_bureau(int num_bureau) {
			this.num_bureau = num_bureau;
		}
		public String getJour() {
			return jour;
		}
		public void setJour(String jour) {
			this.jour = jour;
		}
		public int getNbre_electeur_inscrite() {
			return nbre_electeur_inscrite;
		}
		public void setNbre_electeur_inscrite(int nbre_electeur_inscrite) {
			this.nbre_electeur_inscrite = nbre_electeur_inscrite;
		}
		public int getNbre_votant() {
			return nbre_votant;
		}
		public void setNbre_votant(int nbre_votant) {
			this.nbre_votant = nbre_votant;
		}
		public int getNbre_voi_valide() {
			return nbre_voi_valide;
		}
		public void setNbre_voi_valide(int nbre_voi_valide) {
			this.nbre_voi_valide = nbre_voi_valide;
		}
		public int getNbre_voi_nule() {
			return nbre_voi_nule;
		}
		public void setNbre_voi_nule(int nbre_voi_nule) {
			this.nbre_voi_nule = nbre_voi_nule;
		}
	    
	    

	    
	   
	    
	    
	}
