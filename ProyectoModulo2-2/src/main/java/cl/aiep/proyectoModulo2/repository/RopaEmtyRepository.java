package cl.aiep.proyectoModulo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.aiep.proyectoModulo2.Classes.Auto;
import cl.aiep.proyectoModulo2.Classes.RopaEmty;
@Repository
public interface RopaEmtyRepository  extends JpaRepository <RopaEmty, Integer>{

}
