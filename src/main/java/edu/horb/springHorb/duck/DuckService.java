package edu.horb.springHorb.duck;/*
  @author Bogdan
  @project springHorb
  @class DuckService
  @version 1.0.0
  @since 29.09.2025 - 21.00
*/


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuckService {

    private final DuckRepository duckRepository;

    public DuckService(DuckRepository duckRepository) {
        this.duckRepository = duckRepository;
    }

    public List<Duck> getAll() {
        return duckRepository.findAll();
    }


    public Duck getById(String id) {
        return duckRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        duckRepository.deleteById(id);
    }

    public Duck createDuck(Duck duck) {
        return duckRepository.save(duck);
    }

    public Duck updateDuck(Duck duck) {
        return duckRepository.save(duck);
    }
}