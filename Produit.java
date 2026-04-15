package produit;

public abstract class Produit{
	private String nom;
	Unite unite;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getnom() {
		return nom;
	}
	
	public abstract String decrireProduit();
	
	
	
}