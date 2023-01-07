package com.example.backend.Apllication.controller;

import com.example.backend.Domain.Entities.Tour;
import com.example.backend.Domain.Entities.TipoCentroTour;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("")
public interface Controller  {
    @GetMapping("type")
    public ResponseEntity<List<TipoCentroTour>> getAllTipos();
    @GetMapping("tour")
    public ResponseEntity<List<Tour>> getAllOfertas();
    @PostMapping("tour")
    public ResponseEntity<Tour> createCentroTour(@RequestBody Tour tour);
    @GetMapping("tour/tipo/{id}")
    public ResponseEntity<List<Tour>> getAllTourbyTipo(@PathVariable("id") Integer id);
}
