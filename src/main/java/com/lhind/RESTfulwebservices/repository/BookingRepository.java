package com.lhind.RESTfulwebservices.repository;

import com.lhind.RESTfulwebservices.model.enums.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingRepository {
    Booking findByIdAndUserId(Integer bookingId, Integer id);

    List<Booking> findAllByUserId(Integer id);

    Booking save(Booking booking1);

    Optional<Booking> findById(Integer id);

    List<Booking> findAll();

    void delete(Booking u);

    List<Booking> findByFlights(Object o);
}
