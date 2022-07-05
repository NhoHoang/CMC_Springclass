package com.example.springclass2.service;

import com.example.springclass2.entity.Permission;
import com.example.springclass2.entity.UserPermission;

import java.util.ArrayList;

public interface UserPermissionService {
    ArrayList<UserPermission> getAllUserPermission();

}
