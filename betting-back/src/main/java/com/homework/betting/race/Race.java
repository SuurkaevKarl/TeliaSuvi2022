package com.homework.betting.race;

import com.homework.betting.horse.Horse;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Race {
    @Id
    @SequenceGenerator( // Generates ID
            name = "race_sequence",
            sequenceName = "race_sequence",
            allocationSize = 1
    )
    @GeneratedValue( // Value that needs generation and how
            strategy = GenerationType.SEQUENCE,
            generator = "race_sequence"
    )
    private Long id;
    private String location;
    private LocalDate time;
    @ManyToMany
    @JoinTable(
            name="race_participation",
            joinColumns = @JoinColumn(name = "race_id"),
            inverseJoinColumns = @JoinColumn(name = "horse_id")
    )
    private Set<Horse> participants = new HashSet<>();
    private Long winnerId;

    public Race() {
    }

    public Race(Long id,
                String location,
                LocalDate time,
                Set<Horse> participants,
                Long winnerId) {
        this.id = id;
        this.location = location;
        this.time = time;
        this.participants = participants;
        this.winnerId = winnerId;
    }

    public Race(String location,
                LocalDate time,
                Set<Horse> participants,
                Long winnerId) {
        this.location = location;
        this.time = time;
        this.participants = participants;
        this.winnerId = winnerId;
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getTime() {
        return time;
    }

    public Set<Horse> getParticipants() {
        return participants;
    }

    public Long getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Long winnerID) {
        this.winnerId = winnerID;
    }

    @Override
    public String toString() {
        StringBuilder horses = new StringBuilder();
        for (Horse horse : this.participants) {
            horses.append(horse.toString());
            horses.append(", ");
        }
        return location +
                " @ " +
                time.toString() +
                horses.toString() +
                "WinnerID: " +
                this.winnerId;
    }
}
