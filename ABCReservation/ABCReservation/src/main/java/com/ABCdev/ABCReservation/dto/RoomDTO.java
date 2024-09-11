package com.ABCdev.ABCReservation.dto;


import com.ABCdev.ABCReservation.entity.Booking;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {


    private long id;
    private String roomType;
    private BigDecimal roomPrice;
    private String roomPhotoUrl;
    private String roomDescription;
    private List<BookingDTO> bookings;

    public void setId(Object id) {

    }

    public void setRoomType(String roomType) {
    }

    public void setRoomPrice(BigDecimal roomPrice) {
    }

    public void setRoomPhotoUrl(String roomPhotoUrl) {
    }

    public void setBookings(List<BookingDTO> bookings) {
        this.bookings = bookings;
    }

    public void setRoomDescription(Object roomDescription) {
    }
}


