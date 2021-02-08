package com.rms.reservationservice.model;

import com.rms.reservationservice.entity.ReservationEntity;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class Reservation {

    private String id;
    @NotBlank(message = "First Name should not be empty")
    private String firstName;
    @NotBlank(message = "Last Name should not be empty")
    private String lastName;
    @NotNull
    @FutureOrPresent
    private LocalDateTime reservationTime;
    private int numberOfGuests;
    private int duration;

    public static Reservation from(ReservationEntity reservationEntity) {
        return Reservation.builder()
                .id(reservationEntity.getId())
                .firstName(reservationEntity.getFirstName())
                .lastName(reservationEntity.getLastName())
                .reservationTime(reservationEntity.getReservationTime())
                .numberOfGuests(reservationEntity.getNumberOfGuests())
                .duration(reservationEntity.getDuration())
                .build();
    }
}
