package cl.aiep.proyectoModulo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.aiep.proyectoModulo2.Classes.Auto;
import cl.aiep.proyectoModulo2.Classes.Mueble;
@Repository
public interface MuebleRepository extends JpaRepository <Mueble, Integer> {


}
