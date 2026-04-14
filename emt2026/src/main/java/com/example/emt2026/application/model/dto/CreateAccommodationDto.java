package com.example.emt2026.application.model.dto;


import com.example.emt2026.application.model.domain.Accommodation;
import com.example.emt2026.application.model.domain.Host;
import com.example.emt2026.application.model.enums.Category;
import com.example.emt2026.application.model.enums.Condition;
import jakarta.validation.constraints.Positive;

public record CreateAccommodationDto(
    String name,
    Category category,
    Long hostId,
    Condition condition,
    @Positive
    Integer numRooms,
    Boolean rented
) {
    public Accommodation toAccommodation(Host host) {
        return new Accommodation(name, category, host, condition, numRooms, rented);
    }
}
