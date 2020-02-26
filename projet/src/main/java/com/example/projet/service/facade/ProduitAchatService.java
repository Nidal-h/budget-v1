package com.example.projet.service.facade;

import java.util.Date;
import java.util.List;

import com.example.projet.bean.ProduitAchat;

public interface ProduitAchatService {
	public void save(ProduitAchat produitAchat);
	public List<ProduitAchat> findByAchatDateAchat(Date dateAchat);
	public int verifierAchat();
	public List<ProduitAchat> findByProduitRef(String ref);
	public int effectuerAchat();
}
