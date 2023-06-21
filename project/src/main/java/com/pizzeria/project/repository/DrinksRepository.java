package com.pizzeria.project.repository;

import com.pizzeria.project.model.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinksRepository extends JpaRepository<Drinks, Long> {

}
