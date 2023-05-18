package com.lhind.RESTfulwebservices.services.Impl;

import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.mapper.FlightMapper;
import com.lhind.RESTfulwebservices.model.enums.Flight;
import com.lhind.RESTfulwebservices.repository.FlightRepository;
import com.lhind.RESTfulwebservices.services.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {

    private FlightRepository flightRepository;

    private FlightMapper flightMapper;

    @Override
    public FlightDTO save(Flight f) {
        flightRepository.save(f);
        return flightMapper.toDto(f);
    }

    @Override
    public ThreadLocal<Object> findById(Integer id) {
        return flightRepository.findById(id);
    }

    @Override
    public List<FlightDTO> findAll() {
        List<Flight> flights = flightRepository.findAll();
        List<FlightDTO> flightDTOs = new ArrayList<>();
        for (Flight flight : flights) {
            flightDTOs.add(flightMapper.toDto(flight));
        }
        return flightDTOs;
    }

    @Override
    public void delete(Flight f) { flightRepository.delete(f); }

    @Override
    public ResponseEntity<FlightDTO> findByDateAndAirport(Date date, String airport) {
        Flight flight = flightRepository.findByDepartureDateAndOrigin(date, airport);
        if(flight == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(flightMapper.toDto(flight));
    }
}


