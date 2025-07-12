package com.practice.bookmanagement.response;


import java.util.Objects;

public class BookResponse {
    private String message;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "BookResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
