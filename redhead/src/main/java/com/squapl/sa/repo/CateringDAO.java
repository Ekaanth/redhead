package com.squapl.sa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squapl.sa.domain.Catering;
import java.lang.String;

@Repository
public interface CateringDAO extends JpaRepository<Catering, Long> {

	
	List<Catering> findByRating(String rating);

	Catering findByName(String cateringName);

}
