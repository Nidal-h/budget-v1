package com.example.projet.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projet.bean.Produit;
import com.example.projet.service.facade.ProduitService;

@RestController
@RequestMapping("projet/produit")
public class ProduitRest {
	@Autowired
	private ProduitService produitService;

	@PostMapping("/")
    public int save(@RequestBody Produit produit) {
		return produitService.save(produit);
	}


	@GetMapping("/ref/{ref}")
	public Produit findByRef(@PathVariable String ref) {
		return produitService.findByRef(ref);
	}

}
