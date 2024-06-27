package com.campus.vuelosglobales.tripcrew.domain.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TripCrewPK implements Serializable {

    private Long idEmployee; 
    private Long idConnection;
}
