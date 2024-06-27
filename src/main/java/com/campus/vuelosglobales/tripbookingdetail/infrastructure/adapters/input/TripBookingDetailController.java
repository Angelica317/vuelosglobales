package com.campus.vuelosglobales.tripbookingdetail.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.tripbookingdetail.application.Services.TripBookingDetailService;
import com.campus.vuelosglobales.tripbookingdetail.domain.entities.TripBookingDetail;

@RestController
@RequestMapping("/tripbookingdetails")
public class TripBookingDetailController {

    private final TripBookingDetailService tripBookingDetailService;

    public TripBookingDetailController(TripBookingDetailService tripBookingDetailService) {
        this.tripBookingDetailService = tripBookingDetailService;
    }

    @GetMapping
    public List<TripBookingDetail> getAllTripBookingDetails() {
        return tripBookingDetailService.findAll();
    }

    @GetMapping("/{id}")
    public TripBookingDetail getTripBookingDetailById(@PathVariable Long id) {
        return tripBookingDetailService.findById(id);
    }

    @PostMapping
    public TripBookingDetail createTripBookingDetail(@RequestBody TripBookingDetail tripBookingDetail) {
        return tripBookingDetailService.save(tripBookingDetail);
    }

    @PutMapping("/{id}")
    public TripBookingDetail updateTripBookingDetail(@PathVariable Long id, @RequestBody TripBookingDetail tripBookingDetail) {
        tripBookingDetail.setId(id);
        return tripBookingDetailService.save(tripBookingDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteTripBookingDetail(@PathVariable Long id) {
        tripBookingDetailService.deleteById(id);
    }
}
