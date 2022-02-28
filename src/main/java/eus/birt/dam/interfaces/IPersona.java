package eus.birt.dam.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eus.birt.dam.modelo.Persona;
@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
