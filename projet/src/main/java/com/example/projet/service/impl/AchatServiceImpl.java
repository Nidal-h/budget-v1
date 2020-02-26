package com.example.projet.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projet.bean.Achat;
import com.example.projet.dao.AchatDao;
import com.example.projet.service.facade.AchatService;
@Service
public class AchatServiceImpl implements AchatService{
	@Autowired
    private AchatDao achatDao;
	@Override
	public void save(Achat achat) {
		achatDao.save(achat);
	}
	
	@Override
	public List<Achat> findByDateAchat(Date dateAchat) {
		return achatDao.findByDateAchat(dateAchat);
	}

}
