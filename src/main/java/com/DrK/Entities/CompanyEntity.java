package com.DrK.Entities;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "company")
public class CompanyEntity {
	
	@Id
	private String id;
	
	private String companyName;
	private int foundingYear;
	private int employeesNum;
	private List<CompanyInfoEntity> companyInfo;
	private List<RecruitmentNoticeEntity> recruitmentNotice;

	public boolean equals(final CompanyEntity company) {
		return this.companyName.equals(company.getCompanyName()) &&
			this.employeesNum == company.getEmployeesNum() &&
			this.foundingYear == company.getFoundingYear();
	}
}