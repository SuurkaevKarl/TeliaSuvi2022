package com.homework.betting.horse;

import com.homework.betting.race.Race;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table
public class Horse {
    @Id // Annotation to mark ID for database
    @SequenceGenerator( // Generates ID
            name = "horse_sequence",
            sequenceName = "horse_sequence",
            allocationSize = 1
    )
    @GeneratedValue( // Value that needs generation and how
            strategy = GenerationType.SEQUENCE,
            generator = "horse_sequence"
    )
    private Long id;
    private String name;
    private String color;
    @ManyToMany(mappedBy = "participants")
    private Set<Race> races = new HashSet<>();

    public Horse() {
    }

    public Horse(Long id,
                 String name,
                 String color,
                 Set<Race> races) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.races = races;
    }

    public Horse(String name,
                 String color,
                 Set<Race> races) {
        this.name = name;
        this.color = color;
        this.races = races;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Set<Race> getRaces() {
        return races;
    }

    @Override
    public String toString() {
        return "Nr " +
                this.id +
                " (" +
                name +
                ", " +
                color +
                ")";
    }
}
