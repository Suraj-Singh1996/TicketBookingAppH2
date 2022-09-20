package com.over2cloud.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.over2cloud.ticketbooking.model.Ticket;
import com.over2cloud.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingAppApplication implements CommandLineRunner {
	/*
	 * CommandLineRunner ==> It is a Interface will have run method 
	 * whatever we write in run ==> Called only once by framework during startup
	 * 
	 */
	
	@Autowired
	private TicketService ticketService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ticket ticket = new Ticket();
		
		ticket.setPassengerName("Suraj Singh");
		ticket.setSourceStation("Rishikesh");
		ticket.setDestionationStation("GOA");
		ticket.setTravelDate(new Date());
		ticket.setEmail("surajsingh@gmail.com");
		
		ticketService.createTicket(ticket);
		
	}
	

}
