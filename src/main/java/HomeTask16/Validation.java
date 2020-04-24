package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final Pattern PURSE_PATTERN = Pattern.compile("^[EDR](\\s)*((\\d)(\\s)*){12}$");

    public static void main(String[] args) {
        String address = "E142457896312".trim();
        Matcher matcher = PURSE_PATTERN.matcher(address);
        System.out.println(matcher.matches());

    }
}
