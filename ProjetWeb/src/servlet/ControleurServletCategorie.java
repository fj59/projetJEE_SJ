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

import EJB.AccesCatalogueEJBRemote;
import access.Categorie;


@WebServlet("/ControleurCategorie")
public class ControleurServletCategorie extends HttpServlet {
	  public ControleurServletCategorie() {
	        super();
	        // TODO Auto-generated constructor stub
	   }
	  
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(true);
			
			List<Categorie> categorie=new ArrayList<Categorie>();
			
			try{
				final Hashtable jndiProperties = new Hashtable();
				jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
				final Context context=new InitialContext(jndiProperties);
				final String appName ="JEEProjet";
				final String moduleName = "GestionnaireCommmandes";
				final String distinctName = "";
				final String beanName = "AccesCatalogueEJB";
				final String viewClassName = AccesCatalogueEJBRemote.class.getName();
				AccesCatalogueEJBRemote remote = (AccesCatalogueEJBRemote)context.lookup("ejb:"+appName+"/"+moduleName+"/"+distinctName+"/"+beanName+"!"+viewClassName);
				categorie=remote.getListRequete();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			session.setAttribute("categorie", categorie);
			response.sendRedirect("categories.jsp");
	 }
}
