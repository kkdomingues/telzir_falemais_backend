package br.com.telzir.falemais.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlanResponse {
	private float withPlan;
	private float withoutPlan;
}
