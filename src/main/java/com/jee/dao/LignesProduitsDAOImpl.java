package com.jee.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jee.entity.LignesProduits;

@Repository
public class LignesProduitsDAOImpl implements LignesProduitsDAO {

    @Autowired
    private SessionFactory sessFact;

    @Override
    public List < LignesProduits > getLignesProduits() {
        Session session = sessFact.getCurrentSession();
        CriteriaBuilder crblder = session.getCriteriaBuilder();
        CriteriaQuery < LignesProduits > crqry = crblder.createQuery(LignesProduits.class);
        Root < LignesProduits > admin = crqry.from(LignesProduits.class);
        crqry.select(admin);
        Query query = session.createQuery(crqry);
        return query.getResultList();
    }

    public List<String> getColonneLignesProds(){
    	 Session session = sessFact.getCurrentSession();
    	 return session.createSQLQuery("select lignes_produits from lignes_produits").list();
    }
    
    @Override
    public void saveLProd(LignesProduits Ligneprod) {
        Session currentSession = sessFact.getCurrentSession();
        currentSession.save(Ligneprod);
    }
    
    @Override
    public LignesProduits getOneLProduit(String lprods) {
        Session currentSession = sessFact.getCurrentSession();
        LignesProduits ligneProd = currentSession.get(LignesProduits.class, lprods);
        return ligneProd;
    }
    @Override
    public void updateLProd(LignesProduits Ligneprod){
    	Session currentSession = sessFact.getCurrentSession();
		currentSession.update(Ligneprod);
    }
    
    @Override
    public void deleteLProd(String lprods) {
        Session session = sessFact.getCurrentSession();
        LignesProduits Ligneprod = session.byId(LignesProduits.class).load(lprods);
        session.delete(Ligneprod);
    }
    

}
