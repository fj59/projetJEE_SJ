package gestion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import access.Categorie;
import access.Produit;

public class FacadeProduit extends FacadeAbstraite  {
	public void insertEntity(Categorie bean, EntityManager em){
		em.persist(bean);
		em.flush();
	}
	
	public List<Produit> select(EntityManager em){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Produit> cq = cb.createQuery(Produit.class);
		Root<Produit> root = cq.from(Produit.class);
		cq.select(root);
		TypedQuery<Produit> q = em.createQuery(cq);
		return q.getResultList();
	}
		
}
