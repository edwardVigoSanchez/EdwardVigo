package com.example.backend.Domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tour")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float  tarifaIngreso;
    private String distanciaCentro;
    @ManyToOne
    @JoinColumn( name = "tipo_tour", foreignKey = @ForeignKey(name = "FK_tipo_tour_centro_turistico"),nullable = false)
    TipoCentroTour tipoCentroTour;
}
