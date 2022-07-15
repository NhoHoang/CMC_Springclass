package com.example.springclass2.converter;

import com.example.springclass2.entity.Gender;

import javax.persistence.AttributeConverter;

public class GenderEnumConverter implements AttributeConverter<Gender,String> {
    @Override
    public String convertToDatabaseColumn(Gender attribute) {
        return attribute.getValue();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        return Gender.of(dbData);
    }
}