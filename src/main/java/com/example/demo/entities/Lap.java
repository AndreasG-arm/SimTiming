package com.example.demo.entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lap {
	@Id
	@GeneratedValue 
	private int id;
	
	@Column (nullable = false)
	private LocalTime time;
	
	@Column (nullable = false)
	private int position;
	
	@OneToMany(mappedBy = "id")
	private int raceId;
	
	public Lap() {
		super();
	}
	
	public Lap(int i, LocalTime t, int p, int ri) {
		super();
		this.id = i;
		this.time = t;
		this.position = p;
		this.raceId = ri;
	}
	
}
