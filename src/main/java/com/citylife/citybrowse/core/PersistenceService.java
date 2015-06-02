package com.citylife.citybrowse.core;

import java.util.List;

public interface PersistenceService <E, K> {
	
	E save(E entity);
	 
    E update(E entity);
 
    void remove(E entity);
 
    E findById(K id);
 
    List<E> findAll();
 
    Long getTotalResult();

}
