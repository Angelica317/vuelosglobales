package com.campus.vuelosglobales.domain.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_tripbooking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "idtrips")
    private Trip trip;

    @OneToMany(mappedBy = "tripBooking") // Relación con TripBookingDetail
    private List<TripBooKingDetail> tripBookingDetails;

}
