package com.cogent.Telecom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.Telecom.Repo.CustomercareRepo;
import com.cogent.Telecom.entity.Customercare;

@Service
public class CustomercareService {
	@Autowired
	private CustomercareRepo customercareRepo;
	
	public Customercare addCustomercare(Customercare customercare) {
		return customercareRepo.save(customercare);
	}
	public List<Customercare> getAllCustomercares() {
		return customercareRepo.findAll();
	}
	public Customercare getCustomercareById(long id) {
		Optional<Customercare> thecustomer=customercareRepo.findById(id);
		return thecustomer.get();
	}
	public void deleteCustomercareById(long id) {
		customercareRepo.deleteById(id);
	}

}
