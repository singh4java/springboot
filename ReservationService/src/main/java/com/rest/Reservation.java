package com.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private Long reservationNumber;
	private String travelName;
	private String destination;
	
	

	public Reservation() {
		super();
	}

	public Reservation(String travelName, String destination) {
		super();
		this.travelName = travelName;
		this.destination = destination;
	}

	public Long getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(Long reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getTravelName() {
		return travelName;
	}

	public void setTravelName(String travelName) {
		this.travelName = travelName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
