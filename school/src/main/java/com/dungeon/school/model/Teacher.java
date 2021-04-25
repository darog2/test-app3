package com.dungeon.school.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@XmlType(name = "Teacher")
@XmlAccessorType(XmlAccessType.FIELD)
public class Teacher extends Human{
    @XmlElement
    private String education;
    @XmlElementWrapper(name = "Subjects")
    @XmlElement(name = "Subject")
    private List<Subject> subjectList;

    public Teacher() {
        this.subjectList =new ArrayList<>();
    }

    public Teacher(long id,
                   String fistName,
                   String lastName,
                   String address,
                   String phone,
                   Date dateOfBirth,
                   String education) {
        super(id, fistName, lastName, address, phone, dateOfBirth);
        this.education = education;
        this.subjectList =new ArrayList<>();
    }

    public Teacher(long id,
                   String fistName,
                   String lastName,
                   String address,
                   String phone,
                   String dateOfBirth,
                   String education) {
        super(id, fistName, lastName, address, phone, dateOfBirth);
        this.education = education;
        this.subjectList =new ArrayList<>();
    }
}
