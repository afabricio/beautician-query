package com.beauty.beautician.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/beauticians")
public class BeauticianQueryRestController {

	@Autowired
	private BeauticianQueryService beauticianService;


	@GetMapping
	public  Iterable<Beautician> findAll() {
		return beauticianService.findAll();
	}
	
	
	@PostMapping
	public Beautician save(@RequestBody Beautician beautician) {
	    return beauticianService.save(beautician);
	}

	
	

	
}