package com.example.emt2026.application.service.domain.impl;


import com.example.emt2026.application.model.domain.Host;
import com.example.emt2026.application.model.exception.ResourceNotFoundException;
import com.example.emt2026.application.repository.HostRepository;
import com.example.emt2026.application.service.domain.HostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServiceImpl implements HostService {
    private final HostRepository hostRepository;

    public HostServiceImpl(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @Override
    public List<Host> findAll() {
        return hostRepository.findAll();
    }

    @Override
    public Host findById(Long id) {
        return hostRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Host with id %d not found!", id)));
    }

    @Override
    public Host create(Host host) {
        return hostRepository.save(host);
    }

    @Override
    public Host update(Long id, Host host) {
        Host existingHost = hostRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Host with id %d not found!", id)));
        existingHost.setName(host.getName());
        existingHost.setSurname(host.getSurname());
        existingHost.setCountry(host.getCountry());
        return hostRepository.save(existingHost);
    }

    @Override
    public Host delete(Long id) {
        Host host = hostRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Host with id %d not found!", id)));
        hostRepository.delete(host);
        return host;
    }
}
