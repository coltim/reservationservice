package com.rms.reservationservice.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = ReservationIdValidator.class)
@Documented
public @interface ValidateID {
    String message() default "ReservationId is invalid.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
