package com.khursheed.trialtask.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
public class Features { 
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String type;
	
	@OneToMany
	private List<Attributes> attributes;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Attributes> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attributes> attributes) {
		this.attributes = attributes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
