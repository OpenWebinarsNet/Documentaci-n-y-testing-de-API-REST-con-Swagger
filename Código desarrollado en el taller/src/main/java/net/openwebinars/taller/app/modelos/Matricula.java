/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.openwebinars.taller.app.modelos;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author adelm
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matricula implements Serializable{

    private String id;
    private String nombrePropietario;
    private String placa;
    private String marca;
    private String modelo;
}
