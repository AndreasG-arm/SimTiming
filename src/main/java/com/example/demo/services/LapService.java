package com.example.demo.services;

import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Lap;
import com.example.demo.entities.Session;
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
	
	//to create a lap it is added to the session and then the session is saved back to the database
	//the framework then knows that a new lap has been created and automatically adds it to the lap database
	public void create(int sessionId, LocalTime time, int position) {
		Session toUpdate = ss.findById(sessionId);
		toUpdate.addLap(new Lap(time, position));
		ss.update(toUpdate);
		//return this.repo.save(new Lap(time, position));
	}
	
	public List<Lap> findAll(){
		return this.repo.findAll();
	}
}
