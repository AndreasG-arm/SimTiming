package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Session {
	@Id
	@GeneratedValue 
	@OneToMany (mappedBy = "Lap")
	private int id;
	
	@Column (nullable = false)
	private char type;
	
	private int startPos;
	private int finishPos;
	
	public Session(char t, int sp, int fp) {
		super();
		this.type = t;
		this.startPos = sp;
		this.finishPos = fp;
	}
	
	public Session() {
		super();
	}
}
