package org.tju.ebs.entity;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 8646252084421323618L;
	
	private Integer id;
	private String shortName;
	private String fullName;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
