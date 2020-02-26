package com.example.projet.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projet.bean.Achat;
@Repository
public interface AchatDao extends JpaRepository<Achat, Long>{
	public List<Achat> findByDateAchat(Date dateAchat);
}
