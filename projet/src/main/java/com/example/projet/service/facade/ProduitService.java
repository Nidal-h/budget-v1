package com.example.projet.service.facade;

import com.example.projet.bean.Produit;

public interface ProduitService {
	public int save(Produit produit);
	public Produit findByRef(String ref);
}
