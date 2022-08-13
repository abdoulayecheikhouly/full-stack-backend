/*
package com.fullstack.backend.fulstackbackend;

import com.fullstack.backend.fulstackbackend.model.Produit;
import com.fullstack.backend.fulstackbackend.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class FulstackBackendApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit(){
		Produit p=new Produit("samsung",65000.00,new Date(),);
		produitRepository.save(p);
	}
	@Test
	public void testReadProduit(){
		Produit pro;
		pro = produitRepository.findById(1L).get();
		System.out.println(pro);
	}


}
*/
