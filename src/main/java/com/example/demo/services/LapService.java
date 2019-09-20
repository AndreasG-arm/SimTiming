package com.example.demo.services;

import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Lap;
import com.example.demo.repositories.LapRepo;

@Service
public class LapService {
	private LapRepo repo;
	private SessionService ss;
	
	//this is the preferred way to inject dependencies as it only 
	//injects when the object is instantiated 
	//default constructors are only required in entities (it is required by JPA)
	public LapService(LapRepo repo, SessionService service) {
		super();
		this.repo = repo;
		this.ss = service;
	}
	
	public Lap create(LocalTime time, int position, int raceId) {
		
		return this.repo.save(new Lap(time, position, raceId));
	}
	
	public List<Lap> findAll(){
		return this.repo.findAll();
	}
}
