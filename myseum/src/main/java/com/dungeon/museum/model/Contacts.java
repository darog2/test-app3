package com.dungeon.museum.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Contacts {
    private String phoneNumber;
    private String email;
}
