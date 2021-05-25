package com.dungeon.person.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Human implements Comparable<Human>{
    private String name;
    private String lastName;
    private String address;
    private Date birthDate;
    private Date employedDate;
    private double salary;

    @Override
    public int compareTo(Human o) {
        return (this.name+" "+this.lastName).compareTo(o.name+" "+o.lastName);
    }
}
