package com.DrK.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UserPortfolio")
public class UserPortfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idx;

	@Column(name = "UserIdx",nullable = false)
	private int UserIdx;

	@Column(name = "PortfolioName",nullable = false,length = 50)
	private String portfolioName;
	
	@Column(name = "PortfolioPath",nullable = false,length = 300)
	private String portfolioPath;
}
