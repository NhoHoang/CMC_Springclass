package com.example.springclass2.service;

import com.example.springclass2.common.CustomResponse;
import com.example.springclass2.dto.UserDTO;
import com.example.springclass2.dto.UserUpdateDTO;
import com.example.springclass2.entity.Permission;
import com.example.springclass2.entity.User;
import com.example.springclass2.exception.BussinessException;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Optional;

public interface UserService {
    ArrayList<User> getAllUser(Permission permissionName);

    CustomResponse<Object> createUser(UserDTO dto) throws BussinessException;

    CustomResponse<Object>updateUser(UserUpdateDTO dto) throws BussinessException;

    CustomResponse<Object> deleteUser(int userId) throws BussinessException;
}
