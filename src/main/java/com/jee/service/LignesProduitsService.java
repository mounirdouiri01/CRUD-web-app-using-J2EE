package com.jee.service;

import java.util.List;

import com.jee.entity.LignesProduits;

public interface LignesProduitsService {

	public List<LignesProduits> getLignesProds();    
	
	public List<String> getColonneLProds();  

	public void saveLProd(LignesProduits lp);   
	
	public LignesProduits getOneLigneProd(String lp);  
	
	public void updateLProd(LignesProduits lp);

	public void deleteLProd(String lp);

}
