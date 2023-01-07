package com.example.backend.Implements.repository;

import com.example.backend.Domain.Entities.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfertaRepositoryJPA extends JpaRepository <Tour,Integer> {

    @Query("SELECT o FROM Tour o WHERE o.tipoCentroTour.id=:id")
    public List<Tour> getBytipo(@Param("id") Integer id);

}
