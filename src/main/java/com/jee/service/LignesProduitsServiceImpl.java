package com.jee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jee.dao.LignesProduitsDAO;
import com.jee.entity.LignesProduits;


@Service
public class LignesProduitsServiceImpl implements LignesProduitsService {

    @Autowired
    private LignesProduitsDAO lignePrdDAO;

    @Override
    @Transactional
    public List<LignesProduits> getLignesProds() {
        return lignePrdDAO.getLignesProduits();
    }

    @Override
    @Transactional
    public List<String> getColonneLProds(){
    	return lignePrdDAO.getColonneLignesProds();
    }

    @Override
    @Transactional
    public void saveLProd(LignesProduits lp) {
    	lignePrdDAO.saveLProd(lp);
    }

    @Override
    @Transactional
    public LignesProduits getOneLigneProd(String lp) {
        return lignePrdDAO.getOneLProduit(lp);
    }
    
    @Override
    @Transactional
    public void updateLProd(LignesProduits lp) {
    	lignePrdDAO.updateLProd(lp);
    }
    
    @Override
    @Transactional
    public void deleteLProd(String lp) {
    	lignePrdDAO.deleteLProd(lp);
    }
}
