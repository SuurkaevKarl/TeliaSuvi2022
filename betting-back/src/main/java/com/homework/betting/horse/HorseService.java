package com.homework.betting.horse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorseService {

    private final HorseRepository horseRepository;

    @Autowired
    public HorseService(HorseRepository horseRepository) {
        this.horseRepository = horseRepository;
    }

    public List<Horse> getHorses() {
        return horseRepository.findAll();
    }

    public Horse getHorseById(Long id) {
        return horseRepository.findById(id).orElseThrow();
    }

    public void addHorse(Horse horse) {
        if (horseRepository
                .findHorseByNameAndColor(
                        horse.getName(), horse.getColor()
                ).isPresent()) {
            throw new IllegalStateException("Horse already registered!");
        }

        System.out.println(horse);

        horseRepository.save(horse);
    }
}
