package com.citylife.citybrowse.repository;

import com.citylife.citybrowse.model.News;

public interface NewsDao {
	public void store(News news);

    public void delete(Long courseId);

    public News findById(Long courseId);

   
}
