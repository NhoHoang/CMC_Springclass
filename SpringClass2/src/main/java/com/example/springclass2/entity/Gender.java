package com.example.springclass2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

//@Getter
//@AllArgsConstructor
public enum Gender {
    MALE,
    FEMALE,
    UNKNOWN;

//    private String value;
//
//    private static final Map<String, Gender> genderMap = new HashMap<>();
//
//    static {
//        for (Gender gender : Gender.values()) {
//            genderMap.put(gender.value, gender);
//        }
//    }
//
//    public static Gender of(String s) {
//        return genderMap.get(s);
//    }

}
