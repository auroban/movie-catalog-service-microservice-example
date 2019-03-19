package com.auro.example.microservice.resources;

import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auro.example.microservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieCatalogResource.class);

	@RequestMapping("{userId}")
	public java.util.List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		
		logger.info(userId);
		
		return Collections.singletonList(
					new CatalogItem("Movie 1", "Description 1", 5)
				);
	}
}
