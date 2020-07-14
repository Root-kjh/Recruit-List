package com.DrK.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Data
@Entity(name = "User")
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idx;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name="password", nullable = false, length = 128)
	private String password;
	
	@Column(name="email", nullable = false, length = 100)
	private String email;

	@Temporal(TemporalType.DATE)
	private Date signupDate;
	
	@OneToMany
	@JoinColumn(name = "userIdx")
	private List<UserLikeCompany> companies = new ArrayList<UserLikeCompany>();
}
