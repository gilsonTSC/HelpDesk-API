package com.gilsontsc.helpDesk.api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gilsontsc.helpDesk.api.enums.PriorityEnum;
import com.gilsontsc.helpDesk.api.enums.StatusEnum;

import lombok.Data;

@Document
@Data
public class Ticket {

	@Id
	private String id;
	
	@DBRef(lazy=true)
	private User user;
	
	private Date data;
	
	private String title;
	
	private Integer number;
	
	private StatusEnum status;
	
	private PriorityEnum priority;
	
	@DBRef(lazy=true)
	private User assignedUser;
	
	private String description;
	
	private String image;
	
	private List<ChangeStatus> changes;
	
}