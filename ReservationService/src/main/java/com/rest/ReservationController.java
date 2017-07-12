package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
	
	private ReservationRepository reservationRepository;

	@Autowired
	public ReservationController(ReservationRepository reservationRepository) {
		super();
		this.reservationRepository = reservationRepository;
	}
	
	
}
