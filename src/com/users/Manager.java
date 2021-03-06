package com.users;

import com.hotel.Hotel;

public class Manager extends Account {
    private Hotel hotel;
    private final String ACCESSKEY = "akachukwu123";

    public Manager(String name, int accountId, String emailId,Hotel theHotelYouAreManagerOf){
        super(name, accountId, emailId);
        this.setHotel(theHotelYouAreManagerOf);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getACCESSKEY() {
        return ACCESSKEY;
    }
}
