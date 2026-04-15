package produit;

public abstract class Poisson extends Produit {
	private String date_peche;
	private String nom = "poisson";
	private Unite unite = Unite.PIECE;
	
	
	public Poisson(String nom, Unite unite, String date) {
		super(nom, unite);
		this.date_peche = date ;
	}
	@Override
	public String decrireProduit() {
		return this.nom+" pêchés "+this.date_peche;
	}
}
