package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Data
@SuperBuilder

public  abstract class Human extends BaseEntity{
    //todo: address?
    private String lastName;
    private Date dateOfBirth;
    Contacts contact;
}
