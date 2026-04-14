package com.example.emt2026.application.service.application;
import com.example.emt2026.application.model.dto.CreateHostDto;
import com.example.emt2026.application.model.dto.DisplayHostDto;

import java.util.List;

public interface HostApplicationService {
    List<DisplayHostDto> findAll();

    DisplayHostDto findById(Long id);

    DisplayHostDto create(CreateHostDto createHostDto);

    DisplayHostDto update(Long id, CreateHostDto createHostDto);

    DisplayHostDto delete(Long id);
}
