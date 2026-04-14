package com.example.emt2026.application.service.domain;


import com.example.emt2026.application.model.domain.Host;

import java.util.List;


public interface HostService {
    List<Host> findAll();

    Host findById(Long id);

    Host create(Host host);

    Host update(Long id, Host host);

    Host delete(Long id);
}
