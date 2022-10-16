package com.bv.service;

import com.bv.entity.DcCases;
import com.bv.entity.DcChildrens;
import com.bv.entity.DcEducation;
import com.bv.entity.DcIncome;

public interface DcService {
	
	public String createCase(DcCases caseId);
	
	public String incomeDetails(DcIncome caseNumber);
	
	public String educationDetails(DcEducation caseNumber);
	
	public String childrenDetails(DcChildrens caseNumber);

}
