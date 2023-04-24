package com.project.beack_end_restaurant.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Pratos, Long> {
    List<Pratos> findAll();

    Optional<Pratos> findById(Long id);
}
