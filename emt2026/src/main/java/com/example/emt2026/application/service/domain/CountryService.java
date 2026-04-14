package com.example.emt2026.application.service.domain;



import com.example.emt2026.application.model.domain.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();

    Country findById(Long id);

    Country create(Country country);

    Country update(Long id, Country country);

    Country delete(Long id);
}
