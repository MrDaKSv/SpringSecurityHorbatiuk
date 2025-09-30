package edu.horb.springHorb.duck;/*
  @author Bogdan
  @project springHorb
  @class DuckControllet
  @version 1.0.0
  @since 29.09.2025 - 21.09
*/


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ducks")
public class DuckController {

    private final DuckService duckService;

    public DuckController(DuckService duckService) {
        this.duckService = duckService;
    }

    @GetMapping
    public List<Duck> getDuck(){
        return duckService.getAll();
    }

    @GetMapping("/{id}")
    public Duck getOneDuck(@PathVariable String id){
        return duckService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        duckService.deleteById(id);
    }

    @PostMapping
    public Duck create(@RequestBody Duck duck){
        return duckService.createDuck(duck);
    }

    @PutMapping
    public Duck update(@RequestBody Duck duck){
        return duckService.updateDuck(duck);
    }
}
