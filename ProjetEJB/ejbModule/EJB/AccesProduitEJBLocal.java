package EJB;

import java.util.List;

import javax.ejb.Local;

import access.Produit;

@Local
public interface AccesProduitEJBLocal {


	 public void insertEntity(Produit bean);
	 public List<Produit>  getListRequete(String categorie);
	 public Produit  getProduit(String id);
}
