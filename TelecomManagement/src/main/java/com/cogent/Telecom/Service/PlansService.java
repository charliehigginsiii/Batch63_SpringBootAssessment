package com.cogent.Telecom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.Telecom.Repo.CustomercareRepo;
import com.cogent.Telecom.Repo.PlansRepo;
import com.cogent.Telecom.entity.Customercare;
import com.cogent.Telecom.entity.Plans;

@Service
public class PlansService {
	@Autowired
	private PlansRepo plansRepo;
	
	public Plans addPlans(Plans Plans) {
		return plansRepo.save(Plans);
	}
	public List<Plans> getAllPlanss() {
		return plansRepo.findAll();
	}
	public Plans getPlansById(long id) {
		Optional<Plans> theplan=plansRepo.findById(id);
		return theplan.get();
	}
	public void deletePlansById(long id) {
		plansRepo.deleteById(id);
	}
}
