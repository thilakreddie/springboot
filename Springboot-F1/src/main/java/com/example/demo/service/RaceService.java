package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Race;

public interface RaceService {
	
	Race createRace(Race race);
	public Race getRaceById(long race_id);
	public List<Race> getAllRace();
	Race updateRace(long race_id, Race race);
	void deleteRace(long race_id);
	
	public List<Integer> getYear() ;

//	public List<Driver> getDrivers();
//
//	public List<Constructor> getConstructors() ;


	

}
