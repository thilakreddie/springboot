package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "races")
public class Race {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long race_id;
    private int year;
    private int round;
    private long circuit_id;
    private String name;
    private LocalDate date;

	
	public int getYear() {
		return year;
	}
	public long getRace_id() {
		return race_id;
	}
	public void setRace_id(long race_id) {
		this.race_id = race_id;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public long getCircuit_id() {
		return circuit_id;
	}
	public void setCircuit_id(long circuit_id) {
		this.circuit_id = circuit_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
    
	
	
	
	
	
	
	
	

}
