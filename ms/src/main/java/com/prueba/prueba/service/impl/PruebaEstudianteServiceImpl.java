package com.prueba.prueba.service.impl;

import com.prueba.prueba.entity.PruebaEstudiante;
import com.prueba.prueba.exceptions.ResourceNotFoundException;
import com.prueba.prueba.repository.PruebaEstudianteRepository;
import com.prueba.prueba.resource.model.request.PruebaEstudianteReq;
import com.prueba.prueba.service.PruebaEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PruebaEstudianteServiceImpl implements PruebaEstudianteService {
    @Autowired
    private PruebaEstudianteRepository repository;

    @Override
    public List<PruebaEstudiante> list() {
        return this.repository.findAll();
    }

    @Override
    public PruebaEstudiante getById(String id) {
        return this.repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Prueba estudiante no encontrado con el id: "+ id));
    }
    @Override
    public PruebaEstudiante save(PruebaEstudianteReq pruebaEstudianteReq) {
        String id = UUID.randomUUID().toString();

        PruebaEstudiante pruebaEstudiante = new PruebaEstudiante();

        pruebaEstudiante.setId(id);
        pruebaEstudiante.setNombre(pruebaEstudianteReq.getNombre());
        pruebaEstudiante.setGrado(pruebaEstudianteReq.getGrado());
        pruebaEstudiante.setEspecialidad(pruebaEstudianteReq.getEspecialidad());

        return this.repository.save(pruebaEstudiante);
    }

    @Override
    public PruebaEstudiante update(String id, PruebaEstudianteReq pruebaEstudianteReq) {
        Optional<PruebaEstudiante> opt = repository.findById(id);
        if(opt.isPresent()){
            PruebaEstudiante pruebaEstudiante = opt.get();
            pruebaEstudiante.setNombre(pruebaEstudianteReq.getNombre());
            pruebaEstudiante.setGrado(pruebaEstudianteReq.getGrado());
            pruebaEstudiante.setEspecialidad(pruebaEstudianteReq.getEspecialidad());
            return repository.save(pruebaEstudiante);
        }
        return  opt.orElseThrow(()-> new ResourceNotFoundException("Prueba estudiante no encontrado con el id: "+ id));
    }

    @Override
    public void delete(String id) {
        this.repository.deleteById(id);
    }


}
