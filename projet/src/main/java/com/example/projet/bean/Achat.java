package com.example.projet.bean;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateAchat;
	private double montantTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public double getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}

	public Achat(Long id, Date dateAchat, double montantTotal) {
		super();
		this.id = id;
		this.dateAchat = dateAchat;
		this.montantTotal = montantTotal;
	}

	public Achat() {
	}

	@Override
	public String toString() {
		return "Achat [id=" + id + ", dateAchat=" + dateAchat + ", montantTotal=" + montantTotal + "]";
	}

	
}
