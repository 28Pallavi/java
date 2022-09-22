package com.jpa.model;

import java.util.List;

import com.jpa.entity.Orders;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@NotNull(message = "Please enter name")
	@Size(min = 2,message = "name should be atleast two character")
	private String cfname;
	
	@NotNull(message = "Please enter surname")
	@Size(min = 3,message = "name should be atleast two character")
	private String clname;
	
	@NotNull(message = "Please enter email")
	@Email(message = "Please enter proper email id") 
	private String cemail;
	
	@NotNull(message = "Please enter phone number")
	@Size(min=10,max=12)
	private long cphone;
	
	@NotNull(message = "Please enter address")
	private String caddr;
	
	private List<Orders> orders;
	
}
