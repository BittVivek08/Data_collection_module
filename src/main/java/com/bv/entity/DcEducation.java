package com.bv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_EDUCATION")
public class DcEducation {
	
	@Id
	private Integer eduId;
	
	private Integer caseNumber;
	
	private String highestQualification;
	
	private Integer graduYear;

}
