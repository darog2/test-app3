package com.dungeon.museum.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Department extends BaseEntity {
    private String description;
    private Employee employees;
    private Contacts contact;
}
