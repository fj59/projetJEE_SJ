package access;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema="catalogue", name="categorie")
public class Categorie implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nom;
	@Column
	private String image;
	

    @OneToMany(mappedBy="categorie")
    List<Produit> produit;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer primaryKey) {
		this.id = primaryKey;
	}

	
	
	
	public void setNom(String nom)
	{
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}
}
