package com.homework.betting.horse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "betting/v1/horse")
public class HorseController {

    private final HorseService horseService;

    @Autowired
    public HorseController(HorseService horseService) {
        this.horseService = horseService;
    }

    @GetMapping
    public List<Horse> getHorses() {
        return horseService.getHorses();
    }

    @PostMapping
    public void registerHorse(@RequestBody Horse horse) {
        horseService.addHorse(horse);
    }

}
