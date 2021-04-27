package com.dungeon.pizza.model;

import lombok.Data;

@Data
public class Client {
    private String name;
    private String address;
    private String phoneNumber;//+38-095-554-54-25

    public Client( ) {
    }

    public Client(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


}
