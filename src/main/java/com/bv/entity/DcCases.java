package com.bv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_CASES")
public class DcCases {
	
	@Id
	private Integer caseId;
	
	private Integer caseNumber;
	
	private Integer appId;
	
	private Integer planId;

}
