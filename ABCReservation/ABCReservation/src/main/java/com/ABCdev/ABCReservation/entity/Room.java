package com.ABCdev.ABCReservation.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomType;

    private BigDecimal roomPrice;

    private String roomPhotoUrl;

    private String roomDescription;
      @OneToMany(mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Booking> bookings = new ArrayList<>();


    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomPhotoUrl='" + roomPhotoUrl + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public BigDecimal getRoomPrice() {
        return this.roomPrice;
    }

    public String getRoomPhotoUrl() {
        return this.roomPhotoUrl;
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public String getRoomDescription() {
        return null;
    }

    public void setRoomPhotoUrl(String imageUrl) {
    }

    public void setRoomType(String roomType) {
    }

    public void setRoomPrice(BigDecimal roomPrice) {
    }

    public void setRoomDescription(String description) {
    }
}
