package com.practice.bookmanagement.response;



public class DeleteMessage {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DeleteMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
