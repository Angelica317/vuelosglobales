package com.campus.vuelosglobales.plane.domain.entities;

import java.util.Date;

import com.campus.vuelosglobales.model.domain.entities.Model;
import com.campus.vuelosglobales.status.domain.entities.Status;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "planes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "plates")
    private String plates;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "fabricationDate")
    @Temporal(TemporalType.DATE)
    private Date fabricationdate;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;
}

