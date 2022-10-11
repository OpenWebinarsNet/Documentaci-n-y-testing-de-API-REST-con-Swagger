package net.openwebinars.taller.app.repositorios;

import org.springframework.data.repository.CrudRepository;

import net.openwebinars.taller.app.modelos.Persona;

public interface PersonaRepositorio extends CrudRepository<Persona, String> {

}
