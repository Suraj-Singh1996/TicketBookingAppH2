/**
 * 
 */
package com.over2cloud.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.over2cloud.ticketbooking.model.Ticket;
import com.over2cloud.ticketbooking.service.TicketService;

/**
 * @author Suraj.Singh
 *
 */

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	
	//JAKSON==> Jakson will convert the JSON obj to Java obj.
	@Autowired
	private TicketService ticketService;
	
	@GetMapping(value = "/allTicket")
	public Iterable<Ticket> getAllTicket(){
		
		return ticketService.getAllTicket();
	}
	
	// Retrieve Single Data
	//{} ==> Represents Dynamic value
	//@PathVariable ==> IT will read the dynamic value from the path and replaces to the java variable 
	@GetMapping(value = "/{id}")
	public Ticket getTicketById(@PathVariable("id") Integer ticketId) {
		return ticketService.getTicket(ticketId);
	}
	
	//@RequestBody ==> It will Scan the body section for rest request 
	@PostMapping(value = "/create")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	//Updating the ticket 
	@PutMapping(value = "/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer id,@PathVariable("newEmail") String email) {
		return ticketService.updateTicket(id, email);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteTicketById(@PathVariable("id") Integer id) {
		ticketService.deleteTicket(id);
	}
	
}
