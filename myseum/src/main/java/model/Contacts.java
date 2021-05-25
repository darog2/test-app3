package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Contacts {//todo: "Contacts", not "Contact"
    private String phoneNumber;
    private String email;
}
