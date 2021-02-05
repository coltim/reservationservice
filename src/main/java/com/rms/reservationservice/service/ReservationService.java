package com.rms.reservationservice.service;

import com.rms.reservationservice.model.Reservation;

public interface ReservationService {

    Reservation saveReservation (Reservation reservation);
    Reservation getReservation (String reservationId);
    Reservation updateReservation (String reservationId, Reservation reservation);
    void deleteReservation (String reservationId);
}
