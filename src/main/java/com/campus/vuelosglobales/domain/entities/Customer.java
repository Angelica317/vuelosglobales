package com.campus.vuelosglobales.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "idDocument")
    private DocumentType documentType;
}
