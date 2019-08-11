package com.beauty.beautician.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BeauticianQueryServiceImpl implements BeauticianQueryService {
	
	@Autowired
	BeauticianRepository repository;

	@Override
	public Iterable<Beautician> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Beautician save(Beautician beautician) {
		// TODO Auto-generated method stub
		return repository.save(beautician);
	}

	
	




}
