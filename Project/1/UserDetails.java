package com.labActivity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "user_details")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	@Column(length=20,nullable=false)
	private String ufname;
	
	@Column(length=20,nullable=false)
	private String ulname;
	
	@Column(length=20,nullable=false)
	private String uemail;
	
	@Column(length=20,nullable=false,unique=true)
	private long cphone;
}
