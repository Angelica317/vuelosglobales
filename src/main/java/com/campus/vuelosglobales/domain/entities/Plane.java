package com.campus.vuelosglobales.domain.entities;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_planes")
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
    private Date fabricationdate;

    @ManyToOne
    @JoinColumn(name = "idStatus")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "idModel")
    private Model model;
}

