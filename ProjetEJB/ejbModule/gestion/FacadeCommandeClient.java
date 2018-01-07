package gestion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import access.Categorie;
import access.CommandeClient;

public class FacadeCommandeClient  extends FacadeAbstraite {

	public void insertEntity(Categorie bean, EntityManager em){
		em.persist(bean);
		em.flush();
	}
	
	public List<CommandeClient> select(EntityManager em){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<CommandeClient> cq = cb.createQuery(CommandeClient.class);
		Root<CommandeClient> root = cq.from(CommandeClient.class);
		cq.select(root);
		TypedQuery<CommandeClient> q = em.createQuery(cq);
		return q.getResultList();
	}
}
