package com.beauty.beautician.query;

import java.awt.print.Book;
import java.util.Map;

public interface BeauticianQueryService {


	 Iterable<Beautician> findAll();

	 Beautician save(Beautician beautician);

}
