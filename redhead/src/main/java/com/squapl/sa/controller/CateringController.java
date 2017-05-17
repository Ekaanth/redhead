package com.squapl.sa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.squapl.sa.domain.Catering;
import com.squapl.sa.service.CateringService;


@Controller
public class CateringController {

	@Autowired
	CateringService cateringService;
	
	@RequestMapping("/event")
	public String display(Model model){
		
		Catering catering = new Catering();
		
		model.addAttribute("catering", catering);
		
		
		return "formpage";
	}
	
	@RequestMapping(value="/userdetails",method = RequestMethod.POST)
	public String userdetails(Model model, @ModelAttribute("catering") Catering catering ){
		
		Catering create = cateringService.save(catering);
		
		model.addAttribute("cateringId", create.getId());
		System.out.println("<<<<<<<<<<<<<<<");
		return "ratingpage";
	}
	
	
	@RequestMapping(value="/userdetails/rating",method = RequestMethod.POST)
	public String ratinguserdetails(Model model,@RequestParam(value="id") Long id, @PathVariable("rate") String rating, String cateringName ){
		System.out.println(">>>>>>");
		Catering find = cateringService.findById(id);
		
		find.setRating(rating);
		
		Catering create = cateringService.save(find);
		
			Catering catering1 = new Catering();
		
		model.addAttribute("catering", catering1);
		
		return "formpage";
	}
	
	@RequestMapping(value="/userdeatils/all")
	public String compeletedetails(Model model){
		
		List<Catering> verygood = cateringService.findByRating("verygood");
		List<Catering> good = cateringService.findByRating("good");
		List<Catering> average = cateringService.findByRating("average");
		List<Catering> belowaverage = cateringService.findByRating("belowaverage");
		List<Catering> bad = cateringService.findByRating("bad");
		
		model.addAttribute("verygood", verygood.size());
		model.addAttribute("good", good.size());
		model.addAttribute("average", average.size());
		model.addAttribute("belowaverage", belowaverage.size());
		model.addAttribute("bad", bad.size());
		
		
		return "resultpage";
	}
}
