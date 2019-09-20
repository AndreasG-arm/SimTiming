package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Lap;

public interface SessionRepo extends JpaRepository <Lap,Integer>{

}
