package gestion;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	static List<ItemPanier> panier=new ArrayList<ItemPanier>();
	
	public Panier()
	{
	}

	public List<ItemPanier> getPanier() {
		return panier;
	}

	public void setPanier(List<ItemPanier> panier) {
		this.panier = panier;
	}
	
	public void addItem(ItemPanier item)
	{
		boolean exist=false;
		for (ItemPanier itemPanier : panier) {
			if(itemPanier.getProduitId()==item.getProduitId())
			{
				itemPanier.setQuantite(itemPanier.getQuantite()+item.getQuantite());
				exist=true;
			}
		}
		if(!exist)
		{
			panier.add(item);
		}
	}

}
