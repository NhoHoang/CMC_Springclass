package com.example.springclass2.repository;

import com.example.springclass2.entity.Permission;
import com.example.springclass2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    ArrayList<User> findByPermissions(Permission permissionName);

    User getUserByName(String name);

    Object getUserById(int userId);

    @Modifying
    @Query("DELETE FROM User u WHERE u.id =:userId")
    void deleteUser(int userId);
}
