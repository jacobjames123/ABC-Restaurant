package com.ABCdev.ABCReservation.dto;

import com.ABCdev.ABCReservation.entity.Booking;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
    private List<BookingDTO> bookings = new ArrayList<>();

    public void setRole(Object role) {
    }

    public void setPhoneNumber(Object phoneNumber) {
    }

    public void setEmail(Object email) {
    }

    public void setName(Object name) {
    }

    public void setId(Object id) {
    }

    public void setBookings(List<Object> list) {

    }
}
