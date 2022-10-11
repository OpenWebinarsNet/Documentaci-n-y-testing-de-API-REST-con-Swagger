package net.openwebinars.taller.app.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.openwebinars.taller.app.modelos.Auto;
import net.openwebinars.taller.app.servicios.AutoServicio;
import java.util.Optional;

@RestController
@RequestMapping(value = "ws/auto/")
@CrossOrigin("*")
public class AutoRestControlador {

    @Autowired
    private AutoServicio servicio;

    @GetMapping(value = "/")
    public List<Auto> getTodos() {
        return servicio.getTodos();
    }

    @GetMapping(value = "/{placa}")
    public Optional<Auto> getById(@PathVariable String placa) {
        return servicio.getValor(placa);
    }

    @PostMapping(value = "/guardar")
    public Auto guardar(@RequestBody Auto auto) {
        return servicio.guardar(auto);
    }

    @GetMapping(value = "/eliminar/{placa}")
    public Optional<Auto> eliminar(@PathVariable String placa) {
        Optional<Auto> auto = servicio.getValor(placa);
        servicio.eliminar(placa);
        return auto;
    }

}
