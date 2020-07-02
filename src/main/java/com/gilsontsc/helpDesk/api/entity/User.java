package com.gilsontsc.helpDesk.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gilsontsc.helpDesk.api.enums.ProfileEnum;

import lombok.Data;

@Document
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Indexed(unique= true)
	@NotNull(message="Email required")
	@Email(message="Email invalid")
	private String email;
	
	@NotNull(message="Password required")
	@Size(min= 6)
	private String password;
	
	private ProfileEnum profile;
	
}