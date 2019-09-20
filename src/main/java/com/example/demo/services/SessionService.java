package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Session;
import com.example.demo.repositories.SessionRepo;

@Service
public class SessionService {
	private SessionRepo repo;
	
	public SessionService(SessionRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Session create(char type, int startPos, int finishPos) {
		return this.repo.save(new Session(type, startPos, finishPos));
	}
	
	public List<Session> findAll(){
		return this.repo.findAll();
	}
}
