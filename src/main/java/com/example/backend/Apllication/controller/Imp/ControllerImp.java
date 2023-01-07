package com.example.backend.Apllication.controller.Imp;

import com.example.backend.Apllication.controller.Controller;
import com.example.backend.Domain.Entities.Tour;
import com.example.backend.Domain.Entities.TipoCentroTour;
import com.example.backend.Domain.service.TourService;
import com.example.backend.Domain.service.TipoTourService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerImp implements Controller {
    private final TipoTourService tipoTourService;
    private final TourService tourService;

    public ControllerImp(TipoTourService tipoTourService, TourService tourService) {
        this.tipoTourService = tipoTourService;
        this.tourService = tourService;
    }

    @Override
    public ResponseEntity<List<TipoCentroTour>> getAllTipos() {
        List<TipoCentroTour> tipoCentroTours = tipoTourService.findAllOrders();
        return new ResponseEntity<List<TipoCentroTour>>(tipoCentroTours, HttpStatus.OK);
    }
    @Override
    public ResponseEntity<List<Tour>> getAllOfertas() {
        List<Tour> usuarios = tourService.findAllOferta();
        return new ResponseEntity<List<Tour>>(usuarios, HttpStatus.OK);
    }
    @Override
    public ResponseEntity<Tour> createCentroTour(@RequestBody Tour tour) {
        Tour usuarioNew = tourService.createOferta(tour);
        return new ResponseEntity<Tour>(usuarioNew, HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<List<Tour>> getAllTourbyTipo(@PathVariable("id") Integer id) {
        List<Tour> usuarios = tourService.findByTipo(id);
        return new ResponseEntity<List<Tour>>(usuarios, HttpStatus.OK);
    }
}
