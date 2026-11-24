package com.areeb.potoharAirways.enums;

public enum City {
    ISLAMABAD(Country.PAKISTAN),
    KARACHI(Country.PAKISTAN),
    LAHORE(Country.PAKISTAN),
    PESHAWAR(Country.PAKISTAN),
    QUETTA(Country.PAKISTAN),
    MULTAN(Country.PAKISTAN);

    private final Country country;

    City(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
