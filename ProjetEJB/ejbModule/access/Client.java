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
@Table(schema="catalogue", name="client")
public class Client implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nom")
	private String nom;
	@Column(name="email")
	private String email;
	@Column(name="telephone")
	private String telephone;
	@Column(name="adresse")
	private String adresse;
	
	@OneToMany(mappedBy="client")
	private List<CommandeClient> commandeClient;
	

	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
