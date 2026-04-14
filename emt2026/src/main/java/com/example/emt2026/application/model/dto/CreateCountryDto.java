package com.example.emt2026.application.model.dto;


import com.example.emt2026.application.model.domain.Country;

public record CreateCountryDto(
    String name,
    String continent
) {
    public Country toCountry() {
        return new Country(name, continent);
    }
}
