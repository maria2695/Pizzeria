package com.pizzeria.project.repository;

import com.pizzeria.project.model.BalanceOfPizzeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceOfPizzeriaRepository extends JpaRepository<BalanceOfPizzeria, Long> {

}
