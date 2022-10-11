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
import net.openwebinars.taller.app.modelos.Matricula;
import net.openwebinars.taller.app.modelos.MatriculaMapper;
import net.openwebinars.taller.app.repositorios.AutoRepositorio;

@Service
public class MatriculaServicio {

    @Autowired
    private MatriculaMapper mapper;

    @Autowired
    private AutoServicio autoServicio;
    
    @Autowired
    private PersonaServicio personaServicio;
    
    public int guardar(Matricula in) {
        autoServicio.guardar(mapper.toAuto(in));
        personaServicio.guardar(mapper.toPersona(in));
        return 1;
    }

}
