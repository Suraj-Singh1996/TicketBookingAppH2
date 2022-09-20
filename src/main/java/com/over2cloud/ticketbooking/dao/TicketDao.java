/**
 * 
 */
package com.over2cloud.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.over2cloud.ticketbooking.model.Ticket;

/**
 * @author Suraj.Singh
 *
 *
 *DAO ==> Data Access Object
 *
 *if any operation with database we will interact with DAO Layer 
 *
 *@Repository ==> Annotation which will internally takes about database connection 
 */


@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
