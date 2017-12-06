package servlet;


import java.io.IOException;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/ControleurAjoutPanier")
public class ControleurServletAjoutPanier extends HttpServlet {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Panier panier=new Panier();
	  public ControleurServletAjoutPanier() {
	        super();
	        // TODO Auto-generated constructor stub
	   }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(true);
			String id = request.getParameter("id");
			Produit produit=new Produit();
			try{
				final Hashtable jndiProperties = new Hashtable();
				jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
				final Context context=new InitialContext(jndiProperties);
				final String appName ="JEEProjet";
				final String moduleName = "GestionnaireCommmandes";
				final String distinctName = "";
				final String beanName = "AccesProduitEJB";
				final String viewClassName = AccesProduitEJBRemote.class.getName();
				AccesProduitEJBRemote remote = (AccesProduitEJBRemote)context.lookup("ejb:"+appName+"/"+moduleName+"/"+distinctName+"/"+beanName+"!"+viewClassName);
				produit=remote.getProduit(id);
				ItemPanier item=new ItemPanier(produit.getId(),1,produit.getPrix(),produit.getNom());
				panier.addItem(item);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			session.setAttribute("panier", panier.getPanier());
			response.sendRedirect("contenuCategories.jsp");
	  }
}