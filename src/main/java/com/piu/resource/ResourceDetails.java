package com.piu.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="RESOURCE_DETAILS")
public class ResourceDetails {
	@Id
	@Column(name="Resource_Id")
	private Integer resourceId;
	
	@Column(name="Resource_Name")
	private String resourceName;
	
	@Column(name="Resource_Skill")
	private String resourceSkill;
	
	@Column(name="Resource_Exp")
	private Double resourceExp;

}
