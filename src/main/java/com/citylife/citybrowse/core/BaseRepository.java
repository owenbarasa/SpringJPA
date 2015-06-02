package com.citylife.citybrowse.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import com.citylife.citybrowse.model.News;

@Transactional
public abstract class BaseRepository<E,K> implements PersistenceService<E, K>{
	private Class<E> entityClass;
  
	
	private EntityManager entityManager;
	protected abstract EntityManager getEntityManager();
   
	protected BaseRepository(Class<E> entityClass){
		this.entityClass=entityClass;
	}
	
	@Transactional
	public E save(E entity) {
		News mynews = (News) entity;
		System.out.println(mynews.getTitle());
		getEntityManager().persist(entity);
		return entity;
	}

	public E update(E entity) {
		return entityManager.merge(entity);
	}

	public void remove(E entity) {
		entityManager.remove(entity);
		//entityManager.
		
	}

	public E findById(K id) {
		return entityManager.find(entityClass, id);
		
	}

	public List<E> findAll() {
		CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return entityManager.createQuery(cq).getResultList();
	}

	public Long getTotalResult() {
		// TODO Auto-generated method stub
		return null;
	}

}
