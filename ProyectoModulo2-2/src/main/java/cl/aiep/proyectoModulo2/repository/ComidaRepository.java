package cl.aiep.proyectoModulo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.aiep.proyectoModulo2.Classes.Comida;
@Repository
public interface ComidaRepository extends JpaRepository<Comida, Integer> {




}
