package com.citylife.citybrowse.core;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJPAPersistenceService <K, E extends AbstractEntity> implements PersistenceService<K, E> {

	
	protected Class<E> entityClass;
	 
    @PersistenceContext
    protected EntityManager em;
 
    //@PostConstruct
    public void init() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
    }
 
    //@Override
    public E save(final E entity) {
        em.persist(entity);
        return entity;
    }
 
    //@Override
    public E update(final E entity) {
        return em.merge(entity);
    }
 
    //@Override
    public void remove(final E entity) {
        em.remove(em.merge(entity));
    }
 
    //@Override
   /* public E findById(final K id) {
        return em.find(entityClass, id);
    }*/
	
}
