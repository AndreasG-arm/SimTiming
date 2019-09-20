package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Lap;

public interface LapRepo extends JpaRepository<Lap, Integer>{

}
