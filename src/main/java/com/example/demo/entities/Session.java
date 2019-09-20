package com.example.demo.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Session {
	@Id
	@GeneratedValue 
	private int id;
	
	@Column (nullable = false)
	private char type;
	
	private int startPos;
	private int finishPos;
	
	@OneToMany (mappedBy = "Lap")
	private Set<Lap> laps;
	
	public Session(char t, int sp, int fp) {
		super();
		this.type = t;
		this.startPos = sp;
		this.finishPos = fp;
	}
	
	public Session() {
		super();
	}
	
	public void addLap(Lap lap) {
		laps.add(lap);
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", type=" + type + ", startPos=" + startPos + ", finishPos=" + finishPos + "]";
	}
}
