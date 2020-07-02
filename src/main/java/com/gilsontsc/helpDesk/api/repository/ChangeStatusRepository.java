package com.gilsontsc.helpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gilsontsc.helpDesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}