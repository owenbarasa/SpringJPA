package com.citylife.citybrowse.model;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="newsCategory")
public class NewsCategory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private boolean active;
	@Column
	private String limage;
	@Column
	private String mediumImage;
	@Column
	private String smallImage;
	
    @ManyToOne(fetch = FetchType.LAZY)
	private User owner;
	@Column
	private ZonedDateTime goLiveDate;
	@Column
	private ZonedDateTime publishedOn;
	@Column
	private ZonedDateTime modifiedOn;
	@Column
	private ZonedDateTime createdOwn;

}
