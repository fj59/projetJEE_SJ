package access;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="catalogue", name="produit_commande")
public class ProduitCommande implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="commande_client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int commande_client_id;
	
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="produit_id")
	private int produitId;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="commande_client_id")
	private int commandeClientId;
	
	@Column(name="quantité")
	private int quantite;
	
	

	public void transformProduitToPanier(Produit produit,int idCommandeClient)
	{
		this.commandeClientId=idCommandeClient;
		this.produitId=produit.getId();
		
	}



	public int getProduitId() {
		return produitId;
	}



	public void setProduitId(int produitId) {
		this.produitId = produitId;
	}



	public int getCommandeClientId() {
		return commandeClientId;
	}



	public void setCommandeClientId(int commandeClientId) {
		this.commandeClientId = commandeClientId;
	}



	public int getQuantite() {
		return quantite;
	}



	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
