package com.jpa.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class OrdersDTO {

	@Id
	private int oid;
	
	@NotNull(message = "Please enter product name")
	private String pname;
	
	@NotNull(message = "Please enter product quantity")
	private int quantity;
	
	@NotNull(message = "Please enter price")
	private double price;
	
	@SuppressWarnings("unused")
	private String orderdate;
	
}
