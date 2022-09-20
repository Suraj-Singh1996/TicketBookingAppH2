/**
 * 
 */
package com.over2cloud.ticketbooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Suraj.Singh
 *
 */
@Entity//This is going to create a table with classname
@Table(name = "tbl_ticket")// Optional ==> it will customize ticket name;
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	
	
	@Column(name = "passenger_name", length = 20,nullable = false)
	private String passengerName;
	
	@Column(name="source_station", length = 20, nullable = false)
	private String sourceStation;
	
	@Column(name="destionation_station", length = 20, nullable = false)
	private String destionationStation;
	
	@Column(name = "travel_date", length = 15, nullable = false)
	private Date travelDate;
	
	private String email;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestionationStation() {
		return destionationStation;
	}

	public void setDestionationStation(String destionationStation) {
		this.destionationStation = destionationStation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket(String passengerName, String sourceStation, String destionationStation, Date travelDate,
			String email) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destionationStation = destionationStation;
		this.travelDate = travelDate;
		this.email = email;
	}

	public Ticket() {
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", sourceStation=" + sourceStation
				+ ", destionationStation=" + destionationStation + ", travelDate=" + travelDate + ", email=" + email
				+ "]";
	}
}
