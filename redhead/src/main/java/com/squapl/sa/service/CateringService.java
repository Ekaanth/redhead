package com.squapl.sa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Catering;
import com.squapl.sa.repo.CateringDAO;

@Service
public class CateringService {
	
	@Autowired
	CateringDAO cateringDAO;

	public Catering save(Catering catering) {
		 return cateringDAO.save(catering);
	}

	public List<Catering> findAll() {
		// TODO Auto-generated method stub
		return cateringDAO.findAll();
	}

	public List<Catering> findByRating(String rating) {
		
		return cateringDAO.findByRating(rating);
	}


	public Catering findById(Long id) {
		return cateringDAO.findOne(id);
	}


}
