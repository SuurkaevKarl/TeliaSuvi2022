package com.homework.betting.race;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
    Optional<Race> findRaceByLocationAndTime(String location, LocalDate time);
    Optional<Race> findRaceById(Long id);
}
