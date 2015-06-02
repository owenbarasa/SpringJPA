package com.citylife.citybrowse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "account")
public class Account implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountid;
	
	@OneToOne
	@JoinColumn(name ="userId")
	private User user;
	
	@OneToOne
	@JoinColumn(name="accountStatus")
	private Status accountStatus;
	
	@Column(name ="username")
	private String username;
	@Column(name ="middlename")
	private String middleName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "mobileName", length = 10)
	private String mobileNumber;
	@Column(name ="description", length= 200)
	private String description;
	

}
