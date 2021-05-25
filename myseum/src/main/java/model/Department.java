package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Department {//todo: entity?
    private String description;
   private Employee employee;//todo: only one?
   private Contacts contact;
}
