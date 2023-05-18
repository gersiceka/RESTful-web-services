package com.lhind.RESTfulwebservices.mapper;

import com.lhind.RESTfulwebservices.model.dto.BookingDTO;
import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.model.dto.UserDTO;
import com.lhind.RESTfulwebservices.model.enums.Booking;
import com.lhind.RESTfulwebservices.model.enums.Flight;
import com.lhind.RESTfulwebservices.model.enums.User;

public abstract class AbstractMapper<Entity , DTO> {


    public abstract Flight toEntity(FlightDTO flightDTO);


    public abstract FlightDTO toDto(Flight flight);

    public abstract User toEntity(UserDTO userDTO);

    public abstract UserDTO toDto(User u);

    public abstract Booking toEntity(BookingDTO bookingDTO);

    public abstract BookingDTO toDto(Booking booking);
}
