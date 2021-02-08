package com.rms.reservationservice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservationIdValidator implements ConstraintValidator<ValidateID, String>
{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = Pattern.compile("([A-Z]){4}[-][0-9]{5}");
        Matcher matcher = pattern.matcher(value.toUpperCase());
        try {
            return matcher.matches();
        }catch (Exception e){
            return false;
        }
    }
}
