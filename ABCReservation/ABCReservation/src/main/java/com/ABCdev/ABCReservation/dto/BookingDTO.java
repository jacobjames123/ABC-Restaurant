package com.ABCdev.ABCReservation.dto;


import com.ABCdev.ABCReservation.entity.Room;
import com.ABCdev.ABCReservation.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;

    public void setId(Long id) {
    }

    public void setCheckInDate(LocalDate checkInDate) {
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
    }

    public void setNumOfAdults(Integer numOfAdults) {
    }

    public void setNumOfChildren(Integer numOfChildren) {
    }

    public void setTotalNumOfGuest(Integer totalNumOfGuest) {
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
    }

    public void setUser(UserDTO userDTO) {
    }

    public void setRoom(RoomDTO roomDTO) {

    }
}
