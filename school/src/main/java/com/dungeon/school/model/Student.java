package com.dungeon.school.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@XmlType(name="Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student extends Human{
    private Group group;

    public Student() {
    }

    public Student(long id,
                   String fistName,
                   String lastName,
                   String address,
                   String phone,
                   Date dateOfBirth,
                   Group group) {
        super(id, fistName, lastName, address, phone, dateOfBirth);
        this.group = group;
    }

    public Student(long id,
                   String fistName,
                   String lastName,
                   String address,
                   String phone,
                   String dateOfBirth) {
        super(id, fistName, lastName, address, phone, dateOfBirth);
    }

    public Student(long id,
                   String fistName,
                   String lastName,
                   String address,
                   String phone,
                   String dateOfBirth,
                   Group group) {
        super(id, fistName, lastName, address, phone, dateOfBirth);
        this.group = group;
    }
}
