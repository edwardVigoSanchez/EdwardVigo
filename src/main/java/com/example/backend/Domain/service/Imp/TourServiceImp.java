package com.example.backend.Domain.service.Imp;

import com.example.backend.Domain.Entities.Tour;
import com.example.backend.Domain.Entities.TipoCentroTour;
import com.example.backend.Domain.Repository.CentroTuristicoRepository;
import com.example.backend.Domain.Repository.TipoCentroTourRepository;
import com.example.backend.Domain.service.TourService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TourServiceImp implements TourService {
    private final CentroTuristicoRepository centroTuristicoRepository;

    private final TipoCentroTourRepository tipoCentroTourRepository;

    public TourServiceImp(CentroTuristicoRepository centroTuristicoRepository, TipoCentroTourRepository tipoCentroTourRepository) {
        this.centroTuristicoRepository = centroTuristicoRepository;
        this.tipoCentroTourRepository = tipoCentroTourRepository;
    }

    @Override
    public Tour createOferta(Tour tour) {
        TipoCentroTour user= tipoCentroTourRepository.getbyId(tour.getTipoCentroTour().getId());
        Tour newTour = new Tour();
        newTour.setTarifaIngreso(tour.getTarifaIngreso());
        newTour.setDistanciaCentro(tour.getDistanciaCentro());
        newTour.setTipoCentroTour(user);
        return centroTuristicoRepository.save(newTour);
    }

    @Override
    public List<Tour> findAllOferta() {
        return centroTuristicoRepository.getAll();
    }

    @Override
    public List<Tour> findByTipo(Integer id) {
        return centroTuristicoRepository.getByTipo(id);
    }

    @Override
    public void delete(Integer id) {
        centroTuristicoRepository.delete(id);
    }
}
