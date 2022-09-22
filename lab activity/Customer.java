package com.jpa.entity;

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


@Table(name = "cust_details")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//Customer entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column(length=20,nullable=false)
	private String cfname;
	
	@Column(length=20,nullable=false)
	private String clname;
	
	@Column(length=20,nullable=false)
	private String cemail;
	
	@Column(length=20,nullable=false,unique=true)
	private long cphone;
	
	@Column(length=20,nullable=false)
	private String caddr;
	
	//@OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
	//@JoinColumn(name="cid")
	
	//private List<Orders> orders;
}
