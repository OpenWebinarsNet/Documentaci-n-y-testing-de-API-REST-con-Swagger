/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.openwebinars.taller.app.servicios;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.openwebinars.taller.app.modelos.Auto;
import java.util.Optional;
import net.openwebinars.taller.app.modelos.Persona;
import net.openwebinars.taller.app.repositorios.PersonaRepositorio;

@Service
public class PersonaServicio {

    @Autowired
    private PersonaRepositorio repositorio;

    public Persona guardar(Persona entity) {
        return repositorio.save(entity);
    }

    public void eliminar(String id) {
        repositorio.deleteById(id);
    }

    public Optional<Persona> getValor(String id) {
        return repositorio.findById(id);
    }

    public List<Persona> getTodos() {
        return (List<Persona>) repositorio.findAll();
    }
}
