package com.homework.betting.race;

import com.homework.betting.horse.Horse;
import com.homework.betting.horse.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
public class RaceService {
    private final RaceRepository raceRepository;
    private final HorseService horseService;

    @Autowired
    public RaceService(RaceRepository raceRepository, HorseService horseService) {
        this.raceRepository = raceRepository;
        this.horseService = horseService;
    }

    public List<Race> getRaces() {
        return raceRepository.findAll();
    }

    public void addRace(Race race) {
        if (raceRepository
                .findRaceByLocationAndTime(
                        race.getLocation(), race.getTime()
                ).isPresent()) {
            throw new IllegalStateException("Race already registered!");
        }

        System.out.println(race);

        raceRepository.save(race);
    }

    public void registerHorseToRace(Long raceId, Long horseId) {
        Race race = raceRepository.getById(raceId);
        Horse horse = horseService.getHorseById(horseId);
        if(horse != null) {
            race.getParticipants().add(horse);
            raceRepository.save(race);
        } else {
            throw new IllegalStateException();
        }

    }

    public void assignWinnerToRace(Long raceId, Long horseId) {
        Race race = raceRepository.getById(raceId);
        if(horseService.getHorseById(horseId) != null) {
            race.setWinnerId(horseId);
            raceRepository.save(race);
        } else {
            throw new IllegalStateException();
        }
    }

    public Horse chooseWinnerForRace(Long raceId) {
        if (raceRepository.findRaceById(raceId).isPresent()) {
            Set<Horse> horses = raceRepository.findRaceById(raceId).get().getParticipants();
            Random random = new Random();
            return horses.stream().toList().get(random.nextInt(horses.size()));
        }

        throw new IllegalStateException("Given race does not exist!");
    }
}
