package com.campus.vuelosglobales.tripbookingdetail.domain.entities;

import com.campus.vuelosglobales.customer.domain.entities.Customer;
import com.campus.vuelosglobales.flightfare.domain.entities.FlightFare;
import com.campus.vuelosglobales.tripbooking.domain.entities.TripBooking;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_tripbookingdetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TripBooKingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idTripBooking", nullable = false)
    private TripBooking tripBooking;

    @ManyToOne
    @JoinColumn(name = "idCustomers", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "idFares", nullable = false)
    private FlightFare flightfare;
}

