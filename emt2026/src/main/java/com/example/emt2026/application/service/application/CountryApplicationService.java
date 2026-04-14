package com.example.emt2026.application.service.application;



import com.example.emt2026.application.model.dto.CreateCountryDto;
import com.example.emt2026.application.model.dto.DisplayCountryDto;

import java.util.List;

public interface CountryApplicationService {
    List<DisplayCountryDto> findAll();

    DisplayCountryDto findById(Long id);

    DisplayCountryDto create(CreateCountryDto createCountryDto);

    DisplayCountryDto update(Long id, CreateCountryDto createCountryDto);

    DisplayCountryDto delete(Long id);
}
