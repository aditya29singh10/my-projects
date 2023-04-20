package com.manyTOmany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String name, List<Project> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.project = project;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	@Id
	private int eid;
	
	@Column(name= "project_name")
	private String name;
	@ManyToMany
	private List<Project> project;
	
	
}
