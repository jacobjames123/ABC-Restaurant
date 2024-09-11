package com.ABCdev.ABCReservation.service.interfac;


import com.ABCdev.ABCReservation.dto.Response;
import com.ABCdev.ABCReservation.entity.Booking;

public interface IBookingService {


    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);



}
