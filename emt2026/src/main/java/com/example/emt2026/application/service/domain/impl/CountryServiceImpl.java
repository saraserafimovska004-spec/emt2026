package com.example.emt2026.application.service.domain.impl;

import com.example.emt2026.application.model.domain.Country;
import com.example.emt2026.application.model.exception.ResourceNotFoundException;
import com.example.emt2026.application.repository.CountryRepository;
import com.example.emt2026.application.service.domain.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Country with id %d not found!", id)));
    }

    @Override
    public Country create(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country update(Long id, Country country) {
        Country existingCountry = countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Country with id %d not found!", id)));
        existingCountry.setName(country.getName());
        existingCountry.setContinent(country.getContinent());
        return countryRepository.save(existingCountry);
    }

    @Override
    public Country delete(Long id) {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Country with id %d not found!", id)));
        countryRepository.delete(country);
        return country;
    }
}
