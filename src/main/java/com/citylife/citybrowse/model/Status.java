package com.citylife.citybrowse.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name ="status")
public class Status {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long statusId;
	
	@Column(name = "title", nullable = false, length = 100)
	private String title;
	
	@Column(name ="description",length =500)
	private String description;
	
	@Column
	private int statCode;
	
	@Column(name = "creation_time", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    private ZonedDateTime creationTime;
	
	@Column(name = "modification_time")
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    private ZonedDateTime modificationTime;
	
	
	
}
