package com.ABCdev.ABCReservation.repo;

import com.ABCdev.ABCReservation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);


}
