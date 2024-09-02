package com.prueba.prueba.controllers;

import com.prueba.prueba.entity.PruebaEstudiante;
import com.prueba.prueba.resource.model.request.PruebaEstudianteReq;
import com.prueba.prueba.service.PruebaEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pruebaEstudiante")
public class PruebaEstudianteController {

    @Autowired
    private PruebaEstudianteService pruebaEstudianteService;

    @GetMapping("/{id}")
    public ResponseEntity<PruebaEstudiante> getById (@PathVariable String id){
        PruebaEstudiante pruebaEstudiante = this.pruebaEstudianteService.getById(id);
        return ResponseEntity.ok().body(pruebaEstudiante);
    }

    @GetMapping
    public ResponseEntity<List<PruebaEstudiante>> getAll (){
        List<PruebaEstudiante> pruebaEstudiantes = this.pruebaEstudianteService.list();
        return ResponseEntity.ok().body(pruebaEstudiantes);
    }

    @PostMapping
    public ResponseEntity<PruebaEstudiante> save (@RequestBody PruebaEstudianteReq pruebaEstudianteReq){
        PruebaEstudiante pruebaEstudiante = this.pruebaEstudianteService.save(pruebaEstudianteReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(pruebaEstudiante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PruebaEstudiante> update (
            @PathVariable String id,
            @RequestBody PruebaEstudianteReq pruebaEstudianteReq
        ){
        PruebaEstudiante pruebaEstudiante = this.pruebaEstudianteService.update(id, pruebaEstudianteReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(pruebaEstudiante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable String id){
        pruebaEstudianteService.delete(id);
        return ResponseEntity.ok().build();
    }


}
