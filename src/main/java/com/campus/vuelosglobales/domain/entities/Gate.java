package com.campus.vuelosglobales.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_gates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gatenumber")
    private String gateNumber;

    @ManyToOne
    @JoinColumn(name = "idairport")
    private Airport airport;
}
