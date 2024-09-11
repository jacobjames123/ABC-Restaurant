package com.ABCdev.ABCReservation.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmationCode;
    private UserDTO user;
    private RoomDTO room;
    private BookingDTO booking;
    private List<UserDTO> userList;
    private List<RoomDTO> roomList;
    private List<BookingDTO> bookingList;

    public void setStatusCode(int i) {
    }

    public void setMessage(String message) {
    }

    public void setUser(UserDTO userDTO) {
    }

    public void setToken(String token) {
    }

    public void setRole(String role) {
    }

    public void setExpirationTime(String s) {

    }

    public void setUserList(List<UserDTO> userDTOList) {
    }

    public void setRoom(RoomDTO roomDTO) {

    }

    public void setRoomList(List<RoomDTO> roomDTOList) {
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
    }

    public void setBooking(BookingDTO bookingDTO) {
    }

    public void setBookingList(List<BookingDTO> bookingDTOList) {
    }

    public int getStatusCode() {
        return statusCode;
    }
}
