package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Nombres;

@Repository
public interface NombresRepo extends JpaRepository<Nombres, Integer> {

}
