package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Race;
import com.example.demo.repository.RaceRepository;
@Service
public class RaceServiceImpl implements RaceService{

	@Autowired
	private RaceRepository raceRepository;
	
	
	@Override
	public List<Race> getAllRace() {
		
		return raceRepository.findAll();
	}
	
	@Override
	public Race getRaceById(long race_id) {
        return raceRepository.findById(race_id).orElse(null);
	}
	@Override
    public Race createRace(Race race) {
        return raceRepository.save(race);
    }
	@Override
    public Race updateRace(long race_id, Race race) {
        Race existingRace = raceRepository.findById(race_id).orElse(null);
        if (existingRace != null) {
            existingRace.setYear(race.getYear());
            existingRace.setRound(race.getRound());
            existingRace.setCircuit_id(race.getCircuit_id());
            existingRace.setName(race.getName());
            existingRace.setDate(race.getDate());
            return raceRepository.save(existingRace);
        }
        return null;
    }

    @Override
    public void deleteRace(long race_id) {
        raceRepository.deleteById(race_id);
    }

	@Override
	public List<Integer> getYear() {
		// TODO Auto-generated method stub
		return null;
	}

}
