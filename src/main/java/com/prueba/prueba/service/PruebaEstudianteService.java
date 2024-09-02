package com.prueba.prueba.service;

import com.prueba.prueba.entity.PruebaEstudiante;
import com.prueba.prueba.repository.PruebaEstudianteRepository;
import com.prueba.prueba.resource.model.request.PruebaEstudianteReq;

import java.util.List;

public interface PruebaEstudianteService {
    List<PruebaEstudiante> list ();
    PruebaEstudiante getById (String id);
    PruebaEstudiante save(PruebaEstudianteReq pruebaEstudiante);
    PruebaEstudiante update (String id, PruebaEstudianteReq pruebaEstudianteReq);
    void delete (String id);
}
