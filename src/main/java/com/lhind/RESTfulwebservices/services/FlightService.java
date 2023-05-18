package com.lhind.RESTfulwebservices.services;

import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.model.enums.Flight;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

public interface FlightService {
    FlightDTO save(Flight f);

    ThreadLocal<Object> findById(Integer flightId);

    List<FlightDTO> findAll();

    void delete(Flight f);

    ResponseEntity<FlightDTO> findByDateAndAirport(Date date, String airport);
}
