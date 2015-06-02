package com.citylife.citybrowse.core;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class AbstractEntity implements Serializable {

    public static final String FIND_ALL = "Entity.findAll";
    
    public static final String TOTAL_RESULT = "Entity.totalResult";
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
}
