package com.rms.reservationservice.entity;

import com.rms.reservationservice.model.Reservation;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@NoArgsConstructor (access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Data
@Builder
@Entity
@Table (name = "reservations")
public class ReservationEntity {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private LocalDateTime reservationTime;
    private int numberOfGuests;
    private int duration;

    public static ReservationEntity from(Reservation reservation) {
        return ReservationEntity.builder()
                .id(reservation.getId())
                .firstName(reservation.getFirstName())
                .lastName(reservation.getLastName())
                .reservationTime(reservation.getReservationTime())
                .numberOfGuests(reservation.getNumberOfGuests())
                .duration(reservation.getDuration())
                .build();
    }
}
