package com.example.projet.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private String ref;
	private double montant;
	
	
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Produit(Long id, String libelle, String ref, double montant) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.ref = ref;
		this.montant = montant;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", ref=" + ref + ", montant=" + montant + "]";
	}



}


