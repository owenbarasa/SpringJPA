package com.citylife.citybrowse.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="news")
public class News {
	
	public News(){}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long newsId;
	@Column(name="title",nullable=false,length=20)
	private String title;
	@Column(name="description",nullable= true, length=100)
	private String description;
	@Column(name = "largeImage")
	private String limage;
	
	@Column
	private String mediumImage;
	@Column
	private String smallImage;
	@ManyToOne
	@JoinColumn(name="userid")
	private User owner;
	@ManyToOne
	private NewsCategory category;
	@Column
	private boolean published;
	@Column
	private ZonedDateTime goLiveDate;
	@Column
	private ZonedDateTime publishedDate;
	@Column
	private ZonedDateTime modifiedDate;
	@Column
	private ZonedDateTime createdDate;
	
	public Long getNewsId() {
		return newsId;
	}
	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLimage() {
		return limage;
	}
	public void setLimage(String limage) {
		this.limage = limage;
	}
	public String getMediumImage() {
		return mediumImage;
	}
	public void setMediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
	}
	public String getSmallImage() {
		return smallImage;
	}
	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public NewsCategory getCategory() {
		return category;
	}
	public void setCategory(NewsCategory category) {
		this.category = category;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean published) {
		this.published = published;
	}
	public ZonedDateTime getGoLiveDate() {
		return goLiveDate;
	}
	public void setGoLiveDate(ZonedDateTime goLiveDate) {
		this.goLiveDate = goLiveDate;
	}
	public ZonedDateTime getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(ZonedDateTime publishedDate) {
		this.publishedDate = publishedDate;
	}
	public ZonedDateTime getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(ZonedDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
