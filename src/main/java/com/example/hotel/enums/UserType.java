package com.example.hotel.enums;


public enum UserType {
    Client("0"),
    HotelManager("1"),
    Manager("2"),
    Admin("3");
    private String value;

    UserType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }

}
