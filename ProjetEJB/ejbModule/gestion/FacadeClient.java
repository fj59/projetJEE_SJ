package gestion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import access.Categorie;
import access.Client;

public class FacadeClient extends FacadeAbstraite  {

	public void insertEntity(Categorie bean, EntityManager em){
		em.persist(bean);
		em.flush();
	}
	
	public List<Client> select(EntityManager em){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Client> cq = cb.createQuery(Client.class);
		Root<Client> root = cq.from(Client.class);
		cq.select(root);
		TypedQuery<Client> q = em.createQuery(cq);
		return q.getResultList();
	}
}
