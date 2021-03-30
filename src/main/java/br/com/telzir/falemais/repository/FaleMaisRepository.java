package br.com.telzir.falemais.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.telzir.falemais.dto.MinutePrice;

@Repository
public interface FaleMaisRepository extends CrudRepository<MinutePrice, Long> {
	public MinutePrice findByOriginAndDestiny(String origin, String destiny);
}
