package com.example.backend.Domain.service;

import com.example.backend.Domain.Entities.Tour;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TourService {
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public Tour createOferta(Tour tour);
    public List<Tour> findAllOferta();
    public List<Tour> findByTipo(Integer dni);
    public void  delete(Integer id);
}
