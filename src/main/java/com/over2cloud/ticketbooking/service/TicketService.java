/**
 * 
 */
package com.over2cloud.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.over2cloud.ticketbooking.dao.TicketDao;
import com.over2cloud.ticketbooking.model.Ticket;

/**
 * @author Suraj.Singh
 *
 *Service Layer ==> @Service ==> business Logic 
 *Transaction Management  
 *We need to call TicketDAO for performing CRUD Operation
 */

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	//Retrieve All The Ticket 
	// Iterable get all the data 
	public Iterable<Ticket> getAllTicket(){
		
		return ticketDao.findAll();
		//findAll ==> select * from tbl_ticket ;
		
	}
	
	// Retrieve  Single Ticket
	
	public Ticket getTicket(Integer ticketId) {
		return ticketDao.findById(ticketId)
				.orElse(new Ticket());// If Ticket exists orElse will not be called 
	}
	
	public Ticket createTicket(Ticket ticket) {
		
		return ticketDao.save(ticket);
	}
	
	//Update Ticket

	public Ticket updateTicket(Integer ticketId,String newEmail ) {
		
		Ticket dbTicketObj = getTicket(ticketId);
		dbTicketObj.setEmail(newEmail);
		
		return ticketDao.save(dbTicketObj);
	}
	
	public void deleteTicket(Integer id) {
		
		ticketDao.deleteById(id);
	}
	
}
