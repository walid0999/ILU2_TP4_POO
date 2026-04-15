package produit;

import personnages.Gaulois;

public abstract class Sanglier extends Produit{
	private  int poids;
	private Gaulois chasseur;
	private String nom = "sanglier";
	private Unite unite = Unite.KILOGRAMME;
	
	public Sanglier(String nom, Unite unite) {
		super(nom, unite);
	}
	
	@Override
	public String decrireProduit() {
		return this.nom + " de "+poids+" "+this.unite.getvaleur()+" chassé par "+chasseur.getNom();
	}
	
	
	
	
}
