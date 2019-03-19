package com.auro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.auro.example.microservice.MovieCatalogServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {MovieCatalogServiceApplication.class})
public class MovieCatalogServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
