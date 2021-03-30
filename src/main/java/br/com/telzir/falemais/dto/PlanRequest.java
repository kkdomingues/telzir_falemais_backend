package br.com.telzir.falemais.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PlanRequest {
	private String origin;
	private String destiny;
	private int minutes;
	private int plan;
}
