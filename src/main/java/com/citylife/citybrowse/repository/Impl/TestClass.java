package com.citylife.citybrowse.repository.Impl;


import java.time.ZonedDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.citylife.citybrowse.jpa.config.JpaConfig;
import com.citylife.citybrowse.model.News;
import com.citylife.citybrowse.repository.NewsDao;
import com.citylife.citybrowse.repository.NewsRepository;
public class TestClass {
    
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
		//context.refresh();
        //context.scan("com.citylife.cityBrowse");
        ServiceName name = (ServiceName) context.getBean("serviceName");
        name.save();
        
        NewsRepository repo = context.getBean(NewsRepository.class);
        //News news =repo.findNewsByTitle("John");
       // System.out.println(news.getTitle());
        
		// TODO Auto-generated method stub
		/*ApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
		context.scan("com.citylife.cityBrowse");*/
		NewsDao repoo = context.getBean(NewsDao.class);
	
		News news = new News();
		news.setTitle("first insert");
		news.setDescription("we are going live");
		news.setLimage("http://localhost");
		news.setCreatedDate(ZonedDateTime.now());
		news.setMediumImage(ZonedDateTime.now().toString());
		
		//ServiceName serv = new ServiceName();
		//name.save();
		repoo.store(news);
       //context.destroy();
	}

}
