package access;

import java.io.Serializable;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nom;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categorieId")
	private Integer categorieId;
	
	@Column
	private String derniereMaj;
	@Column
	private String description;
	@Column
	private Float prix;
	
	

    @OneToMany(mappedBy="produit")
    List<ProduitCommande> produitCommande;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(Integer categorieId) {
		this.categorieId = categorieId;
	}

	public String getDerniereMaj() {
		return derniereMaj;
	}

	public void setDerniereMaj(String derniereMaj) {
		this.derniereMaj = derniereMaj;
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
