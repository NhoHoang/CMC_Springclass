package com.example.springclass2.service.impl;

import com.example.springclass2.entity.Permission;
import com.example.springclass2.repository.PermissionRepository;
import com.example.springclass2.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository repository;

    @Override
    public ArrayList<Permission> getAllPermission() {
        return (ArrayList<Permission>) repository.findAll();
    }

    @Override
    public Permission getAllPermissionFilter(String permissionName) {
        if(permissionName != null) {
            return (Permission) repository.findByPermissionName(permissionName);
        }
        else {
            return null;
        }
    }
}
