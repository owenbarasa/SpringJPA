package com.citylife.citybrowse.repository.Impl;
import java.time.ZonedDateTime;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.citylife.citybrowse.core.BaseRepository;
import com.citylife.citybrowse.model.News;
import com.citylife.citybrowse.model.NewsCategory;
import com.citylife.citybrowse.model.User;
import com.citylife.citybrowse.repository.NewsDao;
import com.citylife.citybrowse.repository.NewsRepository;

@Repository
//@Resource(name="newsRepositoryImpl")
public class NewsRepositoryImpl extends BaseRepository<News, Long> implements NewsDao {
   
	@PersistenceContext
	private EntityManager em;
	
	//@PersistenceUnit
	//private EntityManagerFactory entityManagerFactory;
	
	public NewsRepositoryImpl(){
		super(News.class);
		
	}
	
	@Transactional(readOnly=true)
	public News findNewsByNewsId(Long newsid) {
		
		return super.findById(newsid);
	}

	@Transactional(readOnly=true)
	public List<News> findNewsByGoLiveDate(ZonedDateTime date) {
		
		return null;
	}

	@Transactional(readOnly=true)
	public List<News> findNewsByOwner(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly=true)
	public List<News> findNewsByCategory(NewsCategory category) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(readOnly=true)
	public List<News> findNewsByPublishedDate(ZonedDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Transactional(readOnly=true)
	public News findNewsByTitle(String title) {
		//String query = "select newsId from news where title =?";
		//Query q=em.createNativeQuery(query);
		//q.setParameter(1, title);
		TypedQuery<News> q=(TypedQuery) em.createNamedQuery("select users.newsId from user users where user.users =:title ");
		q.setParameter("title", title);
		return  q.getSingleResult();
	}
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	@Transactional
	@Override
	public void store(News news) {
		super.save(news);
		
	}

	@Transactional
	public void delete(Long courseId) {
		// TODO Auto-generated method stub
		
	}

	


}
