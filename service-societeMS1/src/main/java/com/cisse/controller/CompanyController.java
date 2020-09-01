package com.cisse.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // pour rafraichire notre hashMap
@RestController
public class CompanyController {
	
	@Value("${xParam}")
	private int xParam;
	@Value("${yParam}")
	private int yParam;
	
	@Value("${me}")
	private String me;
	
	@GetMapping("/configCloud")
	public Map<String, Object> ConfigCloud (){
		Map<String, Object> params = new HashMap<>();
		params.put("xParam", xParam);
		params.put("yParam", yParam);
		params.put("me", me);
		params.put("nomProcessus", Thread.currentThread().getName());
		
		return params;
		
	}

}
