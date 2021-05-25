package model;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {//todo: are employees a humans?
    private String lastName;
    private Date age;
    private String education;
    private String phoneNumber;
    private boolean status;
}
