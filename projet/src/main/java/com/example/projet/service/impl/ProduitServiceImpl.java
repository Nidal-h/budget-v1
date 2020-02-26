package com.example.projet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet.bean.Produit;
import com.example.projet.dao.ProduitDao;
import com.example.projet.service.facade.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	private ProduitDao produitDao;

	

	@Override
	public Produit findByRef(String ref) {
		return produitDao.findByRef(ref);
	}
	@Override
	public int save(Produit produit) {
		Produit produitFound=findByRef(produit.getRef());
		if(produitFound!=null) {
			return -1;
		}else {
			produitDao.save(produit);
			return 1;
		}
	}

}
