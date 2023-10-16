package com.rest.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name="ticket")
public class Ticket {
	@Id
	@Column(name="ticket_id")
	private int ticketId;
	@Column(name="passenger_name",nullable=false)
	private String passengerName;
	@Column(name="source_station")
	private String sourceStation;
	@Column(name="dest_station")
	private String destStation;
	@Column(name="email")
	private String email;

}
