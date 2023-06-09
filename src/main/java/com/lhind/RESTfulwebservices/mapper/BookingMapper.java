package com.lhind.RESTfulwebservices.mapper;

import com.lhind.RESTfulwebservices.model.dto.BookingDTO;
import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.model.enums.Booking;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public abstract class BookingMapper extends AbstractMapper<Booking,BookingDTO>{


        FlightMapper flightMapper;



    @Override
        public Booking toEntity(BookingDTO bookingDTO) {
            Booking booking = new Booking();
            booking.setBookingDate(booking.getBookingDate());
            booking.setStatus(booking.getStatus());
            return booking;
        }

        @Override
    public BookingDTO toDto(Booking booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setUserName(booking.getUser().getUsername());
        bookingDTO.setBookingDate(booking.getBookingDate());
        bookingDTO.setStatus(booking.getStatus());
        List<FlightDTO> flightDTOs = booking.getFlights().stream()
                .map(flightMapper::toDto)
                .collect(Collectors.toList());
        bookingDTO.setFlights(flightDTOs);
        return bookingDTO;
    }
}
