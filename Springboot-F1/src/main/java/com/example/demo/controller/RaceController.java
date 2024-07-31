package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Race;
import com.example.demo.service.RaceService;

@RestController
@RequestMapping("/api/")
public class RaceController {

	@Autowired
	private RaceService raceService;
	
	
	
	@GetMapping("/getAllRaces")
	public ResponseEntity<List<Race>> getAllRace(){
		
		return new ResponseEntity<List<Race>>(raceService.getAllRace(), HttpStatus.OK);
	}
	
	 @GetMapping("/getRace/{id}")
	    public ResponseEntity<Race> getRace(@PathVariable("id") long race_id) {
	        return new ResponseEntity<>(raceService.getRaceById(race_id), HttpStatus.OK);
	    }
	 @PutMapping("/{id}")
	    public ResponseEntity<Race> updateRace(@PathVariable long id, @RequestBody Race race) {
	        Race updatedRace = raceService.updateRace(id, race);
	        if (updatedRace != null) {
	            return new ResponseEntity<>(updatedRace, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	 @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteRace(@PathVariable long id) {
	        raceService.deleteRace(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	
}
