package com.campus.vuelosglobales.tripbooking.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.tripbooking.application.Services.TripBookingService;
import com.campus.vuelosglobales.tripbooking.domain.entities.TripBooking;

@RestController
@RequestMapping("/tripbookings")
public class TripBookingController {

    private final TripBookingService tripBookingService;

    public TripBookingController(TripBookingService tripBookingService) {
        this.tripBookingService = tripBookingService;
    }

    @GetMapping
    public List<TripBooking> getAllTripBookings() {
        return tripBookingService.findAll();
    }

    @GetMapping("/{id}")
    public TripBooking getTripBookingById(@PathVariable Long id) {
        return tripBookingService.findById(id);
    }

    @PostMapping
    public TripBooking createTripBooking(@RequestBody TripBooking tripBooking) {
        return tripBookingService.save(tripBooking);
    }

    @PutMapping("/{id}")
    public TripBooking updateTripBooking(@PathVariable Long id, @RequestBody TripBooking tripBooking) {
        tripBooking.setId(id);
        return tripBookingService.save(tripBooking);
    }

    @DeleteMapping("/{id}")
    public void deleteTripBooking(@PathVariable Long id) {
        tripBookingService.deleteById(id);
    }
}
