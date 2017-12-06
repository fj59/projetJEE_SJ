package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import access.ProduitCommande;



@Stateless(mappedName = "PanierJNDI")
public class AccesPanierEJB implements AccesPanierEJBRemote,AccesPanierEJBLocal{
	@PersistenceContext(unitName="managePanier")
	EntityManager em;
    public AccesPanierEJB() {
    }

	@Override
	public void insertEntity(ProduitCommande bean) {
    	em.persist(bean);
    	em.flush();
		
	}
	
	 public void  insertProduit(String idProduit,int idCommande){
		ProduitCommande bean = new ProduitCommande();
		bean.setCommandeClientId(idCommande);
		bean.setProduitId(Integer.parseInt(idProduit.substring(1,2)));
		bean.setQuantite(bean.getQuantite()+1);
		em.persist(bean);
	 }

}


