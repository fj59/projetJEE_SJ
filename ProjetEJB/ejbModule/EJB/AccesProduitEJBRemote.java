package EJB;

import java.util.List;

import javax.ejb.Remote;

import access.Produit;

@Remote
public interface AccesProduitEJBRemote {


	 public void insertEntity(Produit bean);
	 public List<Produit>  getListRequete(String categorie);
	 public Produit  getProduit(String id);
}
