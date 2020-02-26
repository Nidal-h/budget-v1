package com.example.projet.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProduitAchat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double quantite;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Achat achat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Achat getAchat() {
		return achat;
	}

	public void setAchat(Achat achat) {
		this.achat = achat;
	}

	public ProduitAchat(Long id, double quantite, Produit produit, Achat achat) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.produit = produit;
		this.achat = achat;
	}

	public ProduitAchat() {
	}

	@Override
	public String toString() {
		return "ProduitAchat [id=" + id + ", quantite=" + quantite + ", produit=" + produit + ", achat=" + achat + "]";
	}

}
