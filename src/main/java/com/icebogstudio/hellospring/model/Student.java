package com.icebogstudio.hellospring.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3878673171477156882L;
	
	@Size(min = 3, max = 30)
	private String firstName;
	
	@Size(min = 3, max = 30)
	private String lastName;
	
	@NotEmpty
	private String sex;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dob;
	
}
