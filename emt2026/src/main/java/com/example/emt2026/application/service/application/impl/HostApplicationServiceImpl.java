package com.example.emt2026.application.service.application.impl;

import com.example.emt2026.application.model.domain.Country;
import com.example.emt2026.application.model.dto.CreateHostDto;
import com.example.emt2026.application.model.dto.DisplayHostDto;
import com.example.emt2026.application.service.application.HostApplicationService;
import com.example.emt2026.application.service.domain.CountryService;
import com.example.emt2026.application.service.domain.HostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostApplicationServiceImpl implements HostApplicationService {
    private final HostService hostService;
    private final CountryService countryService;

    public HostApplicationServiceImpl(HostService hostService, CountryService countryService) {
        this.hostService = hostService;
        this.countryService = countryService;
    }

    @Override
    public List<DisplayHostDto> findAll() {
        return DisplayHostDto.from(hostService.findAll());
    }

    @Override
    public DisplayHostDto findById(Long id) {
        return DisplayHostDto.from(hostService.findById(id));
    }

    @Override
    public DisplayHostDto create(CreateHostDto createHostDto) {
        Country country = countryService.findById(createHostDto.countryId());
        return DisplayHostDto.from(hostService.create(createHostDto.toHost(country)));
    }

    @Override
    public DisplayHostDto update(Long id, CreateHostDto createHostDto) {
        Country country = countryService.findById(createHostDto.countryId());
        return DisplayHostDto.from(hostService.update(id, createHostDto.toHost(country)));
    }

    @Override
    public DisplayHostDto delete(Long id) {
        return DisplayHostDto.from(hostService.delete(id));
    }
}
