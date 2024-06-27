package com.campus.vuelosglobales.tripbooking.domain.entities;

import java.util.Date;
import java.util.List;

import com.campus.vuelosglobales.trip.domain.entities.Trip;
import com.campus.vuelosglobales.tripbookingdetail.domain.entities.TripBookingDetail;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tripbookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "trips_id", referencedColumnName = "id")
    private Trip trip;

    @OneToMany(mappedBy = "tripBooking", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TripBookingDetail> tripBookingDetails;
}
