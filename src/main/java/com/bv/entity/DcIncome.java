package com.bv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DC_INCOME")
public class DcIncome {
	
	@Id
	private Integer incomeId;
	
	private Integer caseNumber;
	
	private Integer empIncome;
	
	private Integer propertyIncome;

}
