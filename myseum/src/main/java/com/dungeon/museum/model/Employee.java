package com.dungeon.museum.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class Employee extends Human {
    private String lastName;
    private Date age;
    private String education;
    private String phoneNumber;//todo employee already have it in contacts inherited from Human
    private boolean status;
}
