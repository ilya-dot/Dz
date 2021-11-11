package com.example.dzdemo.repositories;

import com.example.dzdemo.dtos.UserDto;
import com.example.dzdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {

}

