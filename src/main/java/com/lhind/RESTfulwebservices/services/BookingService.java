package com.lhind.RESTfulwebservices.services;

import com.lhind.RESTfulwebservices.model.dto.BookingDTO;
import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.model.enums.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    Booking save(Booking booking);

    Optional<Booking> findById(Integer id);

    List<BookingDTO> findAll();

    void delete(Booking u);

    List<Booking> findByFlightId(Integer flightId);

    List<FlightDTO> findAllFlights(Integer id);
}
