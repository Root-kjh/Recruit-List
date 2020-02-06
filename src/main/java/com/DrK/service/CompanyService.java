package com.DrK.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.DrK.entities.Company;

public interface CompanyService {

	public List<Company> getList();
	
	public List<Company> getList(Pageable pageable);

	public List<Company> RecruitCompany();
	
	public List<Company> RecruitCompany(Pageable pageable);
}
