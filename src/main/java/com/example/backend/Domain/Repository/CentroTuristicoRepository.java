package com.example.backend.Domain.Repository;

import com.example.backend.Domain.Entities.Tour;

import java.util.List;

public interface CentroTuristicoRepository {
    public Tour save(Tour tour);
    public List<Tour> getByTipo(Integer id);
    public Tour getbyId(Integer id);
    public List<Tour> getAll();
    public void  delete(Integer id);
}
