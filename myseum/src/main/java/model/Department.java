package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Department {
    private String description;
   private Employee employee;
   private Contacts contact;
}
