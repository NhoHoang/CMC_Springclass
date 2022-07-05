package com.example.springclass2.controller;

import com.example.springclass2.common.CustomResponse;
import com.example.springclass2.common.HttpStatusConstants;
import com.example.springclass2.dto.UserDTO;
import com.example.springclass2.dto.UserUpdateDTO;
import com.example.springclass2.entity.Permission;
import com.example.springclass2.entity.User;
import com.example.springclass2.exception.BussinessException;
import com.example.springclass2.service.PermissionService;
import com.example.springclass2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1/user")

public class UserController {
    @Autowired
    private UserService service;

    @Autowired
    private PermissionService permissionService;
    // check

    @GetMapping()
    public CustomResponse<Object> getAllUser(@RequestHeader(name="permissionName", required = false) String permissionName) {
        Permission response = permissionService.getAllPermissionFilter(permissionName);
        ArrayList<User> entities = service.getAllUser(response);
        return new CustomResponse<>(HttpStatusConstants.SUCCESS_CODE,HttpStatusConstants.SUCCESS_MESSAGE, entities);
    }

    @PostMapping( "/create")
    public CustomResponse<Object> createUser(@RequestBody UserDTO dto) throws BussinessException {
        return service.createUser(dto);
    }

    @PutMapping( "/update")
    public CustomResponse<Object> updateUser(@RequestBody UserUpdateDTO dto) throws BussinessException {
        return service.updateUser(dto);
    }

    @DeleteMapping( "/delete")
    public CustomResponse<Object>  deleteUser(@RequestParam int userId) throws BussinessException {
        return service.deleteUser(userId);
    }
}
