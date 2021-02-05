package com.rms.reservationservice.utils;

import java.util.concurrent.ThreadLocalRandom;

public class IdGenerator {

    private static  final  int MIN_VALUE = 10000;
    private static  final  int MAX_VALUE = 99999;

    public static String generateId(String firstName, String lastName) {
        long randomNum = ThreadLocalRandom
                .current()
                .nextInt(MIN_VALUE, MAX_VALUE + 1);
        return  getCharacters(firstName) +
                getCharacters(lastName) + "-" + randomNum;
    }

    private static String getCharacters(String name) {
        String[] nameSplit = name.split("");
        return  nameSplit[0]
                .concat(nameSplit[nameSplit.length-1])
                .toUpperCase();
    }


}
