package com.jee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jee.dao.ProduitsDAO;
import com.jee.entity.Produits;

@Service
public class ProduitsServiceImpl implements ProduitsService{
	
	@Autowired
	private ProduitsDAO prdDAO;

	@Override
	@Transactional
	public List<Produits> getProduits() {
		return prdDAO.getProduits();
	}

	@Override
	@Transactional
	public List<String> getColonneProds() {
		return prdDAO.getColonneProds();
	}

	@Override
	@Transactional
	public void saveProduit(Produits prod) {
		prdDAO.saveProduit(prod);	
	}

	@Override
	@Transactional
	public Produits getProduit(String codeproduit) {
		return prdDAO.getProduit(codeproduit);
	}

	@Override
	@Transactional
	public void updateProduit(Produits prod) {
		prdDAO.updateProduit(prod);
	}
	
	@Override
	@Transactional
	public void deleteProduit(String codeproduit) {
		prdDAO.deleteProduit(codeproduit);
		
	}

}
