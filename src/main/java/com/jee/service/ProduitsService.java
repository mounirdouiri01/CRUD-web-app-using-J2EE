package com.jee.service;

import java.util.List;

import com.jee.entity.Produits;

public interface ProduitsService {
	
	public List<Produits> getProduits();
	
	public List<String> getColonneProds();

	public void saveProduit(Produits prod);

	public Produits getProduit(String codeproduit);
	
	public void updateProduit(Produits prod);

	public void deleteProduit(String codeproduit);

}
