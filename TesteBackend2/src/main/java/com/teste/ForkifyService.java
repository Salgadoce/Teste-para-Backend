package com.teste;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ForkifyService {
	 private final RestTemplate restTemplate = new RestTemplate();
	    private final String baseUrl = "https://forkify-api.herokuapp.com/api/search";

	    public RecipeResponse buscarReceitas(String prato) {
	        String url = UriComponentsBuilder
	                .fromHttpUrl(baseUrl)
	                .queryParam("q", prato)
	                .toUriString();

	        return restTemplate.getForObject(url, RecipeResponse.class);
	    }
}
