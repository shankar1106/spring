package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data  //lombok
@Entity  // java class into JPA entity
@Table(name="employees")
public class Employee {

	@Id   // primary key of the entity
	@GeneratedValue(strategy= GenerationType.IDENTITY)
		//specifies generation strategies for the values of primary keys
	private long id;
	
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	
}
