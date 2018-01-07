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
@Table(schema="catalogue", name="commande_client")
public class CommandeClient implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="montant")
	private Float montant;


	@Column(name="date_creation")
	private String date_creation;
	
	@Column(name="no_confirmation")
	private Integer no_confirmation;

	@ManyToOne(targetEntity = Client.class)
	@JoinColumn(name="client_id")
	private Integer client_id;
	
	

    @OneToMany(mappedBy="commande_client")
    List<ProduitCommande> produitCommande;
	
}
