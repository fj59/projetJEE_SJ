package EJB;

import java.util.List;

import javax.ejb.Remote;

import access.ProduitCommande;
import access.Produit;

@Remote
public interface AccesPanierEJBRemote {


	 public void insertEntity(ProduitCommande bean);
	 public void  insertProduit(String idProduit,int idCommande);
}
