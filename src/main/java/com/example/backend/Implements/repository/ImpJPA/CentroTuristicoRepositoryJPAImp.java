package com.example.backend.Implements.repository.ImpJPA;

import com.example.backend.Domain.Entities.Tour;
import com.example.backend.Domain.Repository.CentroTuristicoRepository;
import com.example.backend.Implements.repository.OfertaRepositoryJPA;
import com.example.backend.Apllication.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CentroTuristicoRepositoryJPAImp implements CentroTuristicoRepository {

    private final OfertaRepositoryJPA db;

    public CentroTuristicoRepositoryJPAImp(OfertaRepositoryJPA db) {
        this.db = db;
    }

    @Override
    public Tour save(Tour tour) {
        return db.save(tour);
    }



    @Override
    public List<Tour> getByTipo(Integer tipo) {
        return db.getBytipo(tipo);
    }

    @Override
    public Tour getbyId(Integer id) {
        return db.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No Existe el comprador: "+id));
    }

    @Override
    public List<Tour> getAll() {
        return db.findAll();
    }

    @Override
    public void delete(Integer id) {
        db.deleteById(id);
    }
}
