package com.example.springclass2.dto;

import com.example.springclass2.entity.Gender;
import com.example.springclass2.entity.Permission;
import com.example.springclass2.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String name;

    private String permission;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
