package EJB;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import access.Produit;



@Stateless(mappedName = "ProduitJNDI")
public class AccesProduitEJB implements AccesProduitEJBRemote,AccesProduitEJBLocal{
	@PersistenceContext(unitName="manageCatalogue")
	EntityManager em;
    public AccesProduitEJB() {
    }

	@Override
	public void insertEntity(Produit bean) {
    	em.persist(bean);
    	em.flush();
		
	}

	@Override
	public List<Produit> getListRequete(String categorie) {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		 
	  CriteriaQuery<Produit> q = cb.createQuery(Produit.class);
	  Root<Produit> c = q.from(Produit.class);
	  q.select(c).where(cb.equal(c.get("categorieId"),Integer.parseInt(categorie.substring(1,2))));
	  TypedQuery<Produit> tq=em.createQuery(q);
	  
		
        return tq.getResultList();
	}
	

	@Override
	 public Produit  getProduit(String id)
	 {
		  CriteriaBuilder cb = em.getCriteriaBuilder();
		 
		  CriteriaQuery<Produit> q = cb.createQuery(Produit.class);
		  Root<Produit> c = q.from(Produit.class);
		  q.select(c).where(cb.equal(c.get("id"),Integer.parseInt(id.substring(1,2))));
		  TypedQuery<Produit> tq=em.createQuery(q);
		  
			
	       return tq.getSingleResult();
	 }
}


