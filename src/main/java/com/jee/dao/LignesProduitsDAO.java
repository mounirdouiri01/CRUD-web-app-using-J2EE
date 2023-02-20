package com.jee.dao;

import java.util.List;

import com.jee.entity.LignesProduits;

public interface LignesProduitsDAO {

	public List<LignesProduits> getLignesProduits();
	
	public List<String> getColonneLignesProds();

	public void saveLProd(LignesProduits lp);

	public LignesProduits getOneLProduit(String lp);     
	
	public void updateLProd(LignesProduits lprod);  
	public void deleteLProd(String lprod);  
}
