package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name = "order_details")
@Entity
@Setter
@Getter
@AllArgsConstructor
//order entity
public class Orders {
 
	@Id
	private int oid;
	
	@Column(length=20)
	private String pname;
	
	@Column(length=20)
	private int quantity;
	
	@Column(length=20)
	private double price;
	
	@Column(length=10)
	private String orderdate;
	
}
