package com.citylife.citybrowse.repository;

import org.springframework.data.repository.CrudRepository;

import com.citylife.citybrowse.model.NewsCategory;

public interface NewCategoryInterface extends CrudRepository<NewsCategory, Long> {

	
}
