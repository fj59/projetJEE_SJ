package EJB;

import java.util.List;

import javax.ejb.Local;

import access.Categorie;

@Local
public interface AccesCatalogueEJBLocal {


	 public void insertEntity(Categorie bean);
	 public List<Categorie>  getListRequete();
}
