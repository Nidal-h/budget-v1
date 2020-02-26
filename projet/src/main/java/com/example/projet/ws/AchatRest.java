package com.example.projet.ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projet.bean.Achat;
import com.example.projet.service.facade.AchatService;

@RestController
@RequestMapping("projet/achat")
public class AchatRest {
	@Autowired
	private AchatService achatService;
    @PostMapping("/")
	public void save(@RequestBody Achat achat) {
		achatService.save(achat);
	}
    @GetMapping("/dateAchat/")
	public List<Achat> findByDateAchat(Date dateAchat) {
		return achatService.findByDateAchat(dateAchat);
	}

}
