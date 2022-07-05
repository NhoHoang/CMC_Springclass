package com.example.springclass2.exception;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor

public class BussinessException extends RuntimeException {
    private String code;
    private String message;

    public BussinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(String code) {
        this.code = code;

    }

    public String getCode() {
        return code;
    }
}
