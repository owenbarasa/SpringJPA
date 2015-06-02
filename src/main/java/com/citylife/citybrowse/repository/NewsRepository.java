package com.citylife.citybrowse.repository;


import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.citylife.citybrowse.model.News;
import com.citylife.citybrowse.model.NewsCategory;
import com.citylife.citybrowse.model.User;

public interface NewsRepository extends CrudRepository<News, Long> {
	
	public News findNewsByNewsId(Long newsid);
	
	public List<News> findNewsByGoLiveDate(ZonedDateTime date);
	
	public List<News> findNewsByOwner(User user);
	
	public List<News> findNewsByCategory (NewsCategory category);
	
	public List<News> findNewsByPublishedDate(ZonedDateTime date);
	
	public News findNewsByTitle(String title);
	
	

}
