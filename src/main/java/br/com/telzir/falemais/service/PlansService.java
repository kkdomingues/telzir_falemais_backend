package br.com.telzir.falemais.service;

import br.com.telzir.falemais.dto.PlanResponse;

public interface PlansService {
	
	public PlanResponse planVerification(String origin, String destiny, int minute, int plan);

}
