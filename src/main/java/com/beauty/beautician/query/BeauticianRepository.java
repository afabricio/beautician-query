package com.beauty.beautician.query;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BeauticianRepository  extends ElasticsearchRepository<Beautician, String>{
	//extends JpaRepository<Beautician, Long> {
	
	//Page<Book> findByName(String author, Pageable pageable);
	
	Beautician findByName(String name);

}
