package com.test.prg;

import java.sql.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class Student{
	
	@NotEmpty(message="Age cannot be empty")
	@Size(min=1,max=2,message="Age Size should be between 1 to 2")
	private Integer age;
	
	@NotEmpty(message="Name cannot be empty")
	@Size(min=4,max=50,message="Id Size should be between 1 to 50")
	private String name;
	
	@NotEmpty(message="ID cannot be empty")
	@Size(min=1,max=10,message="Id Size should be between 1 to 10")
	private Integer id;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")	
	private Date dob;

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Student() {
		super();
	}
	public Student(Integer age, String name, Integer id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
   public Integer getAge() {
      return age;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }

   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
   
   
   
}
