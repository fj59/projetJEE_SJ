package gestion;

public class ItemPanier {
	
	int produitId;
	int quantite;
	float prix;
	String name;

	public ItemPanier(int produitId, int quantite, float prix, String name)
	{
		this.produitId=produitId;
		this.quantite=quantite;
		this.prix=prix;
		this.name=name;
	}
	
	public ItemPanier()
	{
		this.quantite=0;
	}
	
	
	public int getProduitId() {
		return produitId;
	}

	public void setProduitId(int produitId) {
		this.produitId = produitId;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
