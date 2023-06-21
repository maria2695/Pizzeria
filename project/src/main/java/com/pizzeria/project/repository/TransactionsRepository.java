package com.pizzeria.project.repository;

import com.pizzeria.project.model.Drinks;
import com.pizzeria.project.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long> {

}

