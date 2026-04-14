package com.example.emt2026.application.service.application.impl;

import com.example.emt2026.application.model.dto.CreateCountryDto;
import com.example.emt2026.application.model.dto.DisplayCountryDto;
import com.example.emt2026.application.service.application.CountryApplicationService;
import com.example.emt2026.application.service.domain.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryApplicationServiceImpl implements CountryApplicationService {
    private final CountryService countryService;

    public CountryApplicationServiceImpl(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public List<DisplayCountryDto> findAll() {
        return DisplayCountryDto.from(countryService.findAll());
    }

    @Override
    public DisplayCountryDto findById(Long id) {
        return DisplayCountryDto.from(countryService.findById(id));
    }

    @Override
    public DisplayCountryDto create(CreateCountryDto createCountryDto) {
        return DisplayCountryDto.from(countryService.create(createCountryDto.toCountry()));
    }

    @Override
    public DisplayCountryDto update(Long id, CreateCountryDto createCountryDto) {
        return DisplayCountryDto.from(countryService.update(id, createCountryDto.toCountry()));
    }

    @Override
    public DisplayCountryDto delete(Long id) {
        return DisplayCountryDto.from(countryService.delete(id));
    }
}
