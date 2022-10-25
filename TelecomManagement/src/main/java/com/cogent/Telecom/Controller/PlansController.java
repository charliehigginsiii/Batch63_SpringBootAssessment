package com.cogent.Telecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Telecom.Service.CustomercareService;
import com.cogent.Telecom.Service.PlansService;
import com.cogent.Telecom.entity.Customercare;
import com.cogent.Telecom.entity.Plans;

@RestController
@RequestMapping("/api/plans")
public class PlansController {
	@Autowired
	private PlansService plansService;
	@PostMapping("/addPlans")
	public Plans addPlans(@RequestBody Plans Plans) {
		return plansService.addPlans(Plans);
	}
	@GetMapping("/allPlans")
	public List<Plans> getPlansList(){
		return plansService.getAllPlanss();
	}
	@GetMapping("/getPlan/{id}")
	public Plans getPlansById(@PathVariable long id){
		return plansService.getPlansById(id);
	}
	@GetMapping("/deletePlan/{id}")
	public void deletePlansById(@PathVariable long id){
		plansService.deletePlansById(id);
	}

}
