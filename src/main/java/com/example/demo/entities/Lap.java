package com.example.demo.entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lap {
	@Id
	@GeneratedValue 
	private int id;
	
	@Column (nullable = false)
	private LocalTime time;
	
	@Column (nullable = false)
	private int position;
	
	@ManyToOne
	private Session session;
	
	public Lap() {
		super();
	}
	
	public Lap(LocalTime t, int p) {
		super();
		this.time = t;
		this.position = p;
	}

	@Override
	public String toString() {
		return "Lap [id=" + id + ", time=" + time + ", position=" + position + "]";
	}
}
