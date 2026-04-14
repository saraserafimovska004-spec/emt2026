package com.example.emt2026.application.model.dto;


import com.example.emt2026.application.model.domain.Country;

import java.util.List;

public record DisplayCountryDto(
    Long id,
    String name,
    String continent
) {
    public static DisplayCountryDto from(Country country) {
        return new DisplayCountryDto(
            country.getId(),
            country.getName(),
            country.getContinent()
        );
    }

    public static List<DisplayCountryDto> from(List<Country> countries) {
        return countries.stream().map(DisplayCountryDto::from).toList();
    }
}
