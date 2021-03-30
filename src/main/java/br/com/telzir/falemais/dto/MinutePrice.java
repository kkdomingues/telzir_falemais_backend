package br.com.telzir.falemais.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "minute_price")
public class MinutePrice {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="destiny")
	private String destiny;
	
	@Column(name="price")
	private float price;

}
