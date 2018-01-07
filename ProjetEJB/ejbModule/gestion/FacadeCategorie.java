package gestion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import access.Categorie;

public class FacadeCategorie extends FacadeAbstraite {
	public void insertEntity(Categorie bean, EntityManager em){
		em.persist(bean);
		em.flush();
	}
	
	public List<Categorie> select(EntityManager em){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Categorie> cq = cb.createQuery(Categorie.class);
		Root<Categorie> root = cq.from(Categorie.class);
		cq.select(root);
		TypedQuery<Categorie> q = em.createQuery(cq);
		return q.getResultList();
	}
	
}
