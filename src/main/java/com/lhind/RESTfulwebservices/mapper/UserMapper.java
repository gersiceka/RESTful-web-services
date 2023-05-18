package com.lhind.RESTfulwebservices.mapper;

import com.lhind.RESTfulwebservices.model.dto.BookingDTO;
import com.lhind.RESTfulwebservices.model.dto.FlightDTO;
import com.lhind.RESTfulwebservices.model.dto.UserDTO;
import com.lhind.RESTfulwebservices.model.enums.*;
import org.springframework.stereotype.Component;

@Component
public  class UserMapper extends AbstractMapper<User, UserDTO>{



    @Override
    public User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword("1111");

        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(userDTO.getFirstName());
        userDetails.setLastName(userDTO.getLastName());
        userDetails.setPhoneNumber(userDTO.getPhoneNumber());
        userDetails.setEmail(userDTO.getEmail());

        user.setUserDetails(userDetails);
        user.setRole(RoleEnum.valueOf(userDTO.getRole()));

        return user;
    }
    @Override
    public UserDTO toDto(User u) {
        if (u == null) {
            return null;
        }
        return new UserDTO(u.getUsername(), u.getUserDetails().getFirstName(), u.getUserDetails().getLastName(), (String)u.getRole().name() , u.getUserDetails().getPhoneNumber(), u.getEmail());
    }

    /**
     * @param bookingDTO
     * @return
     */
    @Override
    public Booking toEntity(BookingDTO bookingDTO) {
        return null;
    }

    /**
     * @param booking
     * @return
     */
    @Override
    public BookingDTO toDto(Booking booking) {
        return null;
    }
    /**
     * @param flightDTO
     * @return
     */
    @Override
    public Flight toEntity(FlightDTO flightDTO) {
        return null;
    }

    /**
     * @param flight
     * @return
     */
    @Override
    public FlightDTO toDto(Flight flight) {
        return null;
    }

}