package com.ABCdev.ABCReservation.service.interfac;


import com.ABCdev.ABCReservation.dto.LoginRequest;
import com.ABCdev.ABCReservation.dto.Response;
import com.ABCdev.ABCReservation.entity.User;

public interface IUserService {

    public Response register(User user);

    public Response login(LoginRequest loginRequest);

    public Response getAllUsers();

    public Response getUserBookingHistory(String userId);

    public Response deleteUser(String userId);

    public Response getUserById(String userId);

    public Response getMyInfo(String email);



}
