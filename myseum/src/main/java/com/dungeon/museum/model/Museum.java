package com.dungeon.museum.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Museum extends BaseEntity {
    private String nameMuseum;
    private Address addressMuseum;
    private Department departmentMuseum;
    private Contacts contactsMuseum;
}
