package com.jee.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lignes_produits")
public class LignesProduits {

	@Id
	@NotNull
	@Column(name = "lignes_produits")
	
	protected String lignes_produits;

	@Column(name = "description")
	protected String description;

	public LignesProduits() {
	}

	public void setLignes_produits(String lignes_produits) {
		this.lignes_produits = lignes_produits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public LignesProduits(String lignes_produits, String description) {
		this.lignes_produits = lignes_produits;
		this.description = description;
	}

	public String getLignes_produits() {
		return lignes_produits;
	}

	
	
}
