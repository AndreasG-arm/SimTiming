package com.example.demo;

import java.time.LocalTime;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.services.LapService;
import com.example.demo.services.SessionService;

@SpringBootApplication
public class SimTimingApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SimTimingApplication.class, args);
	
		LapService ls = ac.getBean(LapService.class);
		SessionService ss = ac.getBean(SessionService.class);
		
		ss.create('R', 3, 1);
		ls.create(LocalTime.parse("00:01:15.630"), 1, 1);
		ls.create(LocalTime.parse("00:01:15.420"), 1, 1);
		
		System.out.println(ss.findAll());
		System.out.println(ls.findAll());
	}
}
