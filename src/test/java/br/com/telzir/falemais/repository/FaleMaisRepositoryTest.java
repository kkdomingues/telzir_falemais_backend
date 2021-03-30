package br.com.telzir.falemais.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FaleMaisRepositoryTest {
	
	@Autowired
	private FaleMaisRepository repo;

	@Test
	public void deveriaCarregarOrigemDestinoDeAcordoComPreco() {
		String origin = "011";
		String destiny = "016";
		float price = 1.9F;
		float priceByCall = repo.findByOriginAndDestiny(origin, destiny).getPrice();
		Assert.assertEquals(priceByCall, price, 0);
	}

	@Test
	public void origemDestinoNaoExiste() {
		String origin = "011";
		String destiny = "011";
		Assert.assertNull(repo.findByOriginAndDestiny(origin, destiny));
	}

}
