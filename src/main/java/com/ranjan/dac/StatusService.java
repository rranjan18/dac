package com.ranjan.dac;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

	public StatusModel getStatus() {

		StatusModel statusModel = new StatusModel();

		statusModel.setEnvironment("local");
		statusModel.setHost("Rajeev.Ranjan");
		statusModel.setMessage("Hi Ranjan !!");
		statusModel.setTime(LocalDateTime.now().toString());
		statusModel.setVersion("1.0.0");

		return statusModel;

	}

}
