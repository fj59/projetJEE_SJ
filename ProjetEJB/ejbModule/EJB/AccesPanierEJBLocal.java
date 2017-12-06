package EJB;

import java.util.List;

import javax.ejb.Local;

import access.ProduitCommande;
import access.Produit;

@Local
public interface AccesPanierEJBLocal {


	 public void insertEntity(ProduitCommande bean);
	 public void  insertProduit(String idProduit,int idCommande);
}
