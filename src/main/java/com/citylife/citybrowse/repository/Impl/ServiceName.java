package com.citylife.citybrowse.repository.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.citylife.citybrowse.model.News;
import com.citylife.citybrowse.model.Status;
import com.citylife.citybrowse.repository.NewsDao;
import com.citylife.citybrowse.repository.NewsRepository;

@Component("serviceName")
public class ServiceName {
	
	@Autowired
	@Qualifier("john")
	JohnBa newsDao;
	
	@Autowired
	//@Qualifier("newsRepositoryImpl")
	NewsRepository repo;
	
	@Transactional
	public void save(){
		News news = new News();
		news.setTitle("John");
		news.setDescription("we are going live");
		news.setLimage("http://localhost");
		repo.save(news);
		newsDao.print();
	}
	
	
	

	

}
