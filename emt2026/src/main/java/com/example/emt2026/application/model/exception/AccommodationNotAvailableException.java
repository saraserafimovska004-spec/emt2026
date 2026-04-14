package com.example.emt2026.application.model.exception;

public class AccommodationNotAvailableException extends RuntimeException {
    public AccommodationNotAvailableException(Long id) {
        super(String.format("Accommodation with id %d is already rented!", id));
    }
}
