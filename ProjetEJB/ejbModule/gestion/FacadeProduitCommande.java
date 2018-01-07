package gestion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import access.Categorie;
import access.ProduitCommande;

public class FacadeProduitCommande extends FacadeAbstraite  {
	public void insertEntity(Categorie bean, EntityManager em){
		em.persist(bean);
		em.flush();
	}
	
	public List<ProduitCommande> select(EntityManager em){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ProduitCommande> cq = cb.createQuery(ProduitCommande.class);
		Root<ProduitCommande> root = cq.from(ProduitCommande.class);
		cq.select(root);
		TypedQuery<ProduitCommande> q = em.createQuery(cq);
		return q.getResultList();
	}
	
}
