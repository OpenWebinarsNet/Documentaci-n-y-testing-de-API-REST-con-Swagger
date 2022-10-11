package net.openwebinars.taller.app.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.openwebinars.taller.app.modelos.Matricula;
import net.openwebinars.taller.app.servicios.MatriculaServicio;

@RestController
@RequestMapping(value = "ws/matricula/")
@CrossOrigin("*")
public class MatriculaRestControlador {

    @Autowired
    private MatriculaServicio servicio;

    @PostMapping(value = "/guardar")
    public int guardar(@RequestBody Matricula in) {
        return servicio.guardar(in);
    }


}
