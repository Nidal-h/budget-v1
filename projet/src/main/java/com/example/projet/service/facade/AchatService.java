package com.example.projet.service.facade;

import java.util.Date;
import java.util.List;

import com.example.projet.bean.Achat;

public interface AchatService {
	public void save(Achat achat);
	public List<Achat> findByDateAchat(Date dateAchat);
}
