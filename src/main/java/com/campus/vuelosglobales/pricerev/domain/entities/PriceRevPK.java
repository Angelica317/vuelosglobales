package com.campus.vuelosglobales.pricerev.domain.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PriceRevPK implements Serializable {

    private String idEmployee; // Tipo String según el esquema
    private Long idConnection;
}
