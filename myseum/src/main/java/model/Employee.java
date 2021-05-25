package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class Employee extends Human {
    private String lastName;
    private Date age;
    private String education;
    private String phoneNumber;
    private boolean status;
}
