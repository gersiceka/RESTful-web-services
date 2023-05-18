package com.lhind.RESTfulwebservices.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


    @Component
    @Data
    public class FlightDTO {
        private String airline;
        private String origin;
        private String destination;
        private String status;
        private Date departureDate;
        private Date arrivalDate;
        private Integer flightNumber;
    }


