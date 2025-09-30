package edu.horb.springHorb.duck;/*
  @author Bogdan
  @project springHorb
  @class DuckRepository
  @version 1.0.0
  @since 29.09.2025 - 20.59
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuckRepository extends MongoRepository<Duck, String> {
}
