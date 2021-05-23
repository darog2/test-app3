package model;

import lombok.Data;

@Data
public class Employee {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String education;
    private String phoneNumber;
    private double experience;
}
