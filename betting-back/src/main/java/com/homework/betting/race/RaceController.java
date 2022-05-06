package com.homework.betting.race;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "betting/v1/race")
public class RaceController {
    private final RaceService raceService;

    @Autowired
    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
    public List<Race> getRaces() {
        return raceService.getRaces();
    }

    @PostMapping
    public void registerRace(@RequestBody Race race) {
        raceService.addRace(race);
    }

    @PostMapping("/register-to-race")
    public void registerToRace(@RequestParam Long raceId, @RequestParam Long horseId) {
        raceService.registerHorseToRace(raceId, horseId);
    }

    @PutMapping("/winner")
    public void assignWinnerToRace(@RequestParam Long raceId, @RequestParam Long horseId) {
        raceService.assignWinnerToRace(raceId, horseId);
    }

    @GetMapping("/choose-winner")
    public String chooseWinner(@RequestParam Long raceId){
        return raceService.chooseWinnerForRace(raceId).toString();
    }

}
