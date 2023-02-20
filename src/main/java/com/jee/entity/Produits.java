package com.jee.entity;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "produits")
public class Produits {
	
	@Id
	@NotNull
	@Column(name = "codeproduit")
	protected String codeproduit;
	
	@Column(name = "nomproduit")
	protected String nomproduit;
	
	@Column(name = "ligne_produit")
	protected String ligne_produit;
	
	@Column(name = "echelle_produit")
	protected String echelle_produit;
	
	@Column(name = "fournisseur")
	protected String fournisseur;
	
	@Column(name = "description")
	protected String description;
	
	@Column(name = "quantite_Stock")
	protected int quantite_Stock;
	
	@Column(name = "prix_vente")
	protected float prix_vente;
	
	@Column(name = "MSRP")
	protected float MSRP;

	
	public String getCodeproduit() {
		return codeproduit;
	}
	public void setCodeproduit(String codeproduit) {
		this.codeproduit = codeproduit;
	}
	public String getNomproduit() {
		return nomproduit;
	}
	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}
	public String getLigne_produit() {
		return ligne_produit;
	}
	public void setLigne_produit(String ligne_produit) {
		this.ligne_produit = ligne_produit;
	}
	public String getEchelle_produit() {
		return echelle_produit;
	}
	public void setEchelle_produit(String echelle_produit) {
		this.echelle_produit = echelle_produit;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantite_Stock() {
		return quantite_Stock;
	}
	public void setQuantite_Stock(int quantite_Stock) {
		this.quantite_Stock = quantite_Stock;
	}
	public float getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(float prix_vente) {
		this.prix_vente = prix_vente;
	}
	public float getMSRP() {
		return MSRP;
	}
	public void setMSRP(float mSRP) {
		MSRP = mSRP;
	}
  
	public Produits(String codeproduit, String nomproduit, String ligne_produit, String echelle_produit,
			String fournisseur, String desription, int quantite_Stock, float prix_vente, float mSRP) {
		this.codeproduit = codeproduit;
		this.nomproduit = nomproduit;
		this.ligne_produit = ligne_produit;
		this.echelle_produit = echelle_produit;
		this.fournisseur = fournisseur;
		this.description = desription;
		this.quantite_Stock = quantite_Stock;
		this.prix_vente = prix_vente;
		MSRP = mSRP;
	}
	
	public Produits() {
		
	}
	

}
