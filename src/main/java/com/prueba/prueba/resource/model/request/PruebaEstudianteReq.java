package com.prueba.prueba.resource.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PruebaEstudianteReq {

    private String nombre;
    private String especialidad;
    private String grado;
}
