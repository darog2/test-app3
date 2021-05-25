package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Data
@SuperBuilder

public  abstract class Human extends BaseEntity{
    private Address address;
    private String lastName;
    private Date dateOfBirth;
    private Contacts contact;
}
