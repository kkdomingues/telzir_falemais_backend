package br.com.telzir.falemais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.telzir.falemais.dto.PlanRequest;
import br.com.telzir.falemais.dto.PlanResponse;
import br.com.telzir.falemais.service.PlansService;

@Controller
@RequestMapping("price")
public class PriceController {
	
	@Autowired
	PlansService planService;
	
	@CrossOrigin(origins = "*")
	@PostMapping(path="/validation", consumes="application/json", produces="application/json")
	@ResponseBody
	public PlanResponse plan(@RequestBody PlanRequest plan){
		return planService.planVerification(
				plan.getOrigin(), 
				plan.getDestiny(), 
				plan.getMinutes(), 
				plan.getPlan()
			);
	}

}
