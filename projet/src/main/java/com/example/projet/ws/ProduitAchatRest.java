package com.example.projet.ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projet.bean.Achat;
import com.example.projet.bean.ProduitAchat;
import com.example.projet.service.facade.ProduitAchatService;

@RestController
@RequestMapping("projet/produitAchat")
public class ProduitAchatRest {
	@Autowired
	private ProduitAchatService produitAchatService;

	@PostMapping("/")
	public void save(@RequestBody ProduitAchat produitAchat) {
		produitAchatService.save(produitAchat);
	}
	@PutMapping("/")
    public int verifierAchat() {
		return produitAchatService.verifierAchat();
	}
	@GetMapping("/produit/ref/{ref}")
	public List<ProduitAchat> findByProduitRef(@PathVariable String ref) {
		return produitAchatService.findByProduitRef(ref);
	}
	@PutMapping("/effectuer")
	public int effectuerAchat() {
		return produitAchatService.effectuerAchat();
	}
	@GetMapping("/achat/dateAchat/")
	public List<ProduitAchat> findByAchatDateAchat(Date dateAchat) {
		return produitAchatService.findByAchatDateAchat(dateAchat);
	}
	
}
