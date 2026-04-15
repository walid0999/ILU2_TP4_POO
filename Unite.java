package produit;

public enum Unite {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILILITRE("ml"),
	PIECE("piece");
	private String valeur;
	
	Unite(String valeur){
		this.valeur = valeur;
	}
	
	public String getvaleur() {
		return valeur;
	}
}
