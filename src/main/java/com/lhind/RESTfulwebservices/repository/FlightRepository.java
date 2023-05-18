package com.lhind.RESTfulwebservices.repository;

import com.lhind.RESTfulwebservices.model.enums.Booking;
import com.lhind.RESTfulwebservices.model.enums.Flight;

import java.util.Date;
import java.util.List;

public interface FlightRepository {
    List<Flight> findFlightsByBookings(Booking booking);

    void save(Flight f);

    ThreadLocal<Object> findById(Integer id);

    List<Flight> findAll();

    void delete(Flight f);

    Flight findByDepartureDateAndOrigin(Date date, String airport);
}
