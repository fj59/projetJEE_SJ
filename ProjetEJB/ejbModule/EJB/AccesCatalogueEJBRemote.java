package EJB;

import java.util.List;

import javax.ejb.Remote;

import access.Categorie;

@Remote
public interface AccesCatalogueEJBRemote {


	 public void insertEntity(Categorie bean);
	 public List<Categorie>  getListRequete();
}
