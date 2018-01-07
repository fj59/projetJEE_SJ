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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema="catalogue", name="produit")
public class Produit implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="nom")
	private String nom;

	@Column(name="prix")
	private Float prix;

	@Column(name="description")
	private String description;

	@Column(name="dernier_maj")
	private String derniere_maj;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categorie_id")
	private Categorie categorie;
	
	

    @OneToMany(mappedBy="produit")
    ProduitCommande produitCommande;
	
	public String getDerniere_maj() {
		return derniere_maj;
	}

	public void setDerniere_maj(String derniere_maj) {
		this.derniere_maj = derniere_maj;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public ProduitCommande getProduitCommande() {
		return produitCommande;
	}

	public void setProduitCommande(ProduitCommande produitCommande) {
		this.produitCommande = produitCommande;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDerniereMaj() {
		return derniere_maj;
	}

	public void setDerniereMaj(String derniereMaj) {
		this.derniere_maj = derniereMaj;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer primaryKey) {
		this.id = primaryKey;
	}

	
	
}
