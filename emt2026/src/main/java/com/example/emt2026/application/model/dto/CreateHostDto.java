package com.example.emt2026.application.model.dto;


import com.example.emt2026.application.model.domain.Country;
import com.example.emt2026.application.model.domain.Host;

public record CreateHostDto(
    String name,
    String surname,
    Long countryId
) {
    public Host toHost(Country country) {
        return new Host(name, surname, country);
    }
}
