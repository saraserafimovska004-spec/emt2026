package com.example.emt2026.application.service.application;

import com.example.emt2026.application.model.dto.CreateAccommodationDto;
import com.example.emt2026.application.model.dto.DisplayAccommodationDto;

import java.util.List;

public interface AccommodationApplicationService {
    List<DisplayAccommodationDto> findAll();

    List<DisplayAccommodationDto> findAllByRented(Boolean rented);

    DisplayAccommodationDto findById(Long id);

    DisplayAccommodationDto create(CreateAccommodationDto createAccommodationDto);

    DisplayAccommodationDto update(Long id, CreateAccommodationDto createAccommodationDto);

    DisplayAccommodationDto delete(Long id);

    DisplayAccommodationDto rent(Long id);
}
