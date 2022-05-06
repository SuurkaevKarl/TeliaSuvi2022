package com.homework.betting.horse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HorseRepository extends JpaRepository<Horse, Long> {
    Optional<Horse> findHorseByNameAndColor(String name, String color);
    Optional<Horse> findById(Long id);
}
