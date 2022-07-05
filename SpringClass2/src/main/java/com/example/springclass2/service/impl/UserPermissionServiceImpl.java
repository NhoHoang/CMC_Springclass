package com.example.springclass2.service.impl;

import com.example.springclass2.entity.Permission;
import com.example.springclass2.entity.UserPermission;
import com.example.springclass2.repository.PermissionRepository;
import com.example.springclass2.repository.UserPermissionRepository;
import com.example.springclass2.service.PermissionService;
import com.example.springclass2.service.UserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserPermissionServiceImpl implements UserPermissionService {

    @Autowired
    private UserPermissionRepository repository;

    @Override
    public ArrayList<UserPermission> getAllUserPermission() {
        return (ArrayList<UserPermission>) repository.findAll();
    }


}
