package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Libros;
@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {

}
