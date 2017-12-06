package EJB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import access.Categorie;



@Stateless(mappedName = "CatalogueJNDI")
public class AccesCatalogueEJB implements AccesCatalogueEJBRemote,AccesCatalogueEJBLocal{
	@PersistenceContext(unitName="manageCatalogue")
	EntityManager em;
    public AccesCatalogueEJB() {
    }

	@Override
	public void insertEntity(Categorie bean) {
    	em.persist(bean);
    	em.flush();
		
	}

	@Override
	public List<Categorie> getListRequete() {
        Query query=em.createQuery("select h from AccesCatalogueBean h");
		List<Categorie> cb=new ArrayList<Categorie>();
		cb = query.getResultList();
		
        return cb;
	}
}


