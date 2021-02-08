package com.rms.reservationservice.controller;

import com.rms.reservationservice.model.Reservation;
import com.rms.reservationservice.service.ReservationService;
import com.rms.reservationservice.validation.ValidateID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1/reservation")
@Validated
public class ReservationController {
    public final ReservationService reservationService;

    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@Valid @RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation get(@PathVariable("reservationId") @ValidateID String reservationId)  {
        return reservationService.getReservation(reservationId);
    }

    @PutMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public Reservation update(@PathVariable("reservationId") @ValidateID String reservationId, @RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservationId,reservation);
    }

    @DeleteMapping("/{reservationId}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("reservationId") @ValidateID String reservationId)  {
        reservationService.deleteReservation(reservationId);
    }


}
