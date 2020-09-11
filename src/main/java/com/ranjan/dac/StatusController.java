package com.ranjan.dac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {

	@Autowired
	private StatusService statusService;

	@GetMapping
	public StatusModel getStatus() {

		StatusModel status = statusService.getStatus();
		ResponseEntity<StatusModel> responseEntity = new ResponseEntity<>(status, HttpStatus.CREATED);
		return responseEntity.getBody();

	}

}
