package br.com.telzir.falemais.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.telzir.falemais.dto.MinutePrice;
import br.com.telzir.falemais.dto.PlanResponse;
import br.com.telzir.falemais.repository.FaleMaisRepository;
import br.com.telzir.falemais.service.PlansService;

@Service
public class PlansServiceImpl implements PlansService {
	

	@Autowired
	FaleMaisRepository fmr;

	@Override
	public PlanResponse planVerification(String origin, String destiny, int minute, int plan) {
		PlanResponse pd = new PlanResponse();
		MinutePrice minutePrice = fmr.findByOriginAndDestiny(origin, destiny);
		
		if (minutePrice != null) {
			float priceByCall = minutePrice.getPrice();
			float withPlan = 0;
			float withoutPlan = minute * priceByCall;
			
			if (minute > plan) {
				int overtime = minute - plan;
				float overtimePrice = priceByCall * 0.1F;
				withPlan = overtime * (priceByCall + overtimePrice);
			}
			
			pd.setWithPlan(withPlan);
			pd.setWithoutPlan(withoutPlan);
			return pd;
		}
		
		return new PlanResponse(0.0F, 0.0F);
	}

}
