package com.bv.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_CHILDREN")
public class DcChildrens {
	
	@Id
	private Integer chidrenId;
	
	private Integer caseNumber;
	
	private Date childrenDOB;
	
	private Long childrenSsn;

}
