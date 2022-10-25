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
import com.cogent.Telecom.entity.Customercare;

@RestController
@RequestMapping("api/customercare")
public class CustomercareController {
	@Autowired
	private CustomercareService customercareService;
	@PostMapping("/addcustomercare")
	public Customercare addCustomerCare(@RequestBody Customercare customercare) {
		return customercareService.addCustomercare(customercare);
	}
	@GetMapping("/allcustomercare")
	public List<Customercare> getCustomerCareList(){
		return customercareService.getAllCustomercares();
	}
	@GetMapping("/getcustomercare/{id}")
	public Customercare getCustomerCareById(@PathVariable long id){
		return customercareService.getCustomercareById(id);
	}
	@GetMapping("/deletecustomercare/{id}")
	public void deleteCustomerCareById(@PathVariable long id){
		customercareService.deleteCustomercareById(id);
	}

}
