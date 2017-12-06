package servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import EJB.AccesProduitEJBRemote;
import access.Produit;


@WebServlet("/ControleurProduit")
public class ControleurServletProduit extends HttpServlet {
	
	  public ControleurServletProduit() {
	        super();
	        // TODO Auto-generated constructor stub
	   }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(true);
			String choixCategorie = request.getParameter("categorie");
			
			List<Produit> produits=new ArrayList<Produit>();
			
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
				produits=remote.getListRequete(choixCategorie);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			session.setAttribute("produits", produits);
			response.sendRedirect("contenuCategories.jsp");
			//response.sendRedirect("categories.jsp");
	  }
}