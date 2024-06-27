package com.campus.vuelosglobales.revisiondetail.domain.entities;

import com.campus.vuelosglobales.employee.domain.entities.Employee;
import com.campus.vuelosglobales.revision.domain.entities.Revision;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "revisiondetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RevisionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "revision_id", referencedColumnName = "id")
    private Revision revision;
    
    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
}