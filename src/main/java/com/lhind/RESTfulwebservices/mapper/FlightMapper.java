package com.lhind.RESTfulwebservices.mapper;

import com.lhind.RESTfulwebservices.model.dto.BookingDTO;
import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.model.dto.UserDTO;
import com.lhind.RESTfulwebservices.model.enums.Booking;
import com.lhind.RESTfulwebservices.model.enums.Flight;
import com.lhind.RESTfulwebservices.model.enums.User;
import org.springframework.stereotype.Component;

@Component
public class FlightMapper extends AbstractMapper<Flight, FlightDTO>{
        @Override
        public Flight toEntity(FlightDTO flightDTO) {
            Flight flight = new Flight();
            flight.setFlightNumber(flightDTO.getFlightNumber());
            flight.setAirline(flightDTO.getAirline());
            flight.setOrigin(flightDTO.getOrigin());
            flight.setDestination(flightDTO.getDestination());
            flight.setDepartureDate(flightDTO.getDepartureDate());
            flight.setArrivalDate(flightDTO.getArrivalDate());
            flight.setStatus(flightDTO.getStatus());
            return flight;
        }
        @Override
        public FlightDTO toDto(Flight flight) {
            FlightDTO flightDTO = new FlightDTO();
            flightDTO.setAirline(flight.getAirline());
            flightDTO.setOrigin(flight.getOrigin());
            flightDTO.setDestination(flight.getDestination());
            flightDTO.setDepartureDate(flight.getDepartureDate());
            flightDTO.setArrivalDate(flight.getArrivalDate());
            flightDTO.setStatus(flight.getStatus());
            flightDTO.setFlightNumber(flight.getFlightNumber());
            return flightDTO;
        }

    @Override
    public User toEntity(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO toDto(User u) {
        return null;
    }

    @Override
    public Booking toEntity(BookingDTO bookingDTO) {
        return null;
    }

    @Override
    public BookingDTO toDto(Booking booking) {
        return null;
    }
}
