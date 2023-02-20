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

import com.jee.entity.Produits;

@Repository
public class ProduitsDAOImpl implements ProduitsDAO {
	
    @Autowired
    private SessionFactory sessFact;

	@Override
	public List<Produits> getProduits() {
		Session session = sessFact.getCurrentSession();
		CriteriaBuilder crblder = session.getCriteriaBuilder();
		CriteriaQuery < Produits > crqry = crblder.createQuery(Produits.class);
		Root <Produits> admin = crqry.from(Produits.class);
        crqry.select(admin);
        Query query = session.createQuery(crqry);
        return query.getResultList();
	}

	@Override
	public List<String> getColonneProds() {
		Session session = sessFact.getCurrentSession();
   	 	return session.createSQLQuery("select codeproduit from produits").list();
	}

	@Override
	public void saveProduit(Produits prod) {
		 Session currentSession = sessFact.getCurrentSession();	 
	     currentSession.save(prod);
	}
	
	@Override
	public Produits getProduit(String codeproduit) {
        Session currentSession = sessFact.getCurrentSession();
        Produits prod = currentSession.get(Produits.class, codeproduit);
        return prod;
	}

	@Override
	public void updateProduit(Produits prod) {
		Session currentSession = sessFact.getCurrentSession();
		currentSession.update(prod);
	}
	
	
	@Override
	public void deleteProduit(String codeproduit) {
        Session session = sessFact.getCurrentSession();
        Produits prod = session.byId(Produits.class).load(codeproduit);
        session.delete(prod);
	}

}
