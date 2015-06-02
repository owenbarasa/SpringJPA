package com.citylife.citybrowse.model;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.engine.internal.Cascade;


@Entity
@Table(name ="user")
@NamedQueries(
		@NamedQuery(name = User.FIND_ALL, query = "select b from User b")
		)
public class User  implements Serializable{
	
	public static final String FIND_ALL = "User.findByTitle";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@Column(name = "username", nullable = false,length =100)
	private String username;
	@Column(name = "password", nullable = false,length =100)
	private String password;
	
	@OneToOne
	private Status status;
	
	@OneToMany(mappedBy="owner",cascade=CascadeType.ALL)
	private List<News> newsId;
	
	@Column(name = "creationDate", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
    private ZonedDateTime creationDate;
	@Column(name = "modifiedDate", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
	private Date modifiedDate;

}
