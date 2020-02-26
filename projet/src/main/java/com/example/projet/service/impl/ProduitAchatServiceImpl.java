package com.example.projet.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet.bean.Achat;
import com.example.projet.bean.Produit;
import com.example.projet.bean.ProduitAchat;
import com.example.projet.dao.ProduitAchatDao;
import com.example.projet.service.facade.ProduitAchatService;
import com.example.projet.service.facade.ProduitService;
@Service
public class ProduitAchatServiceImpl implements ProduitAchatService{
	@Autowired
    private ProduitAchatDao produitAchatDao;
	@Autowired
	private ProduitService produitService;
	@Override
	public void save(ProduitAchat produitAchat) {
    produitAchatDao.save(produitAchat);
	}
	@Override
	public List<ProduitAchat> findByAchatDateAchat(Date dateAchat) {
		return produitAchatDao.findByAchatDateAchat(dateAchat);
	}
	@Override
	public int verifierAchat() {
		return 0;
	}
	@Override
	public List<ProduitAchat> findByProduitRef(String ref) {
		return produitAchatDao.findByProduitRef(ref);
	}
	@Override
	public int effectuerAchat(double quantite,ProduitAchat produitAchat) {
		List<ProduitAchat> produitAchats=findByProduitRef(produit.getRef());
		for (ProduitAchat produitAchat : produitAchats) {
			if(produitAchat==null){
				return -2;
			}else {
				produitAchat.setQuantite(quantite);
				produitAchat.getAchat().setDateAchat(new Date());
				produitAchat.getAchat().setMontantTotal(produit.getMontant());
				return 1;
			}
		}
	}

}
