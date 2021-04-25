package com.dungeon.school.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@XmlType(propOrder = {"id", "firstName","lastName","address","phone","dateOfBirth"})
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Human {
    protected static final SimpleDateFormat BIRTH_DATE_FORMAT=new SimpleDateFormat("dd.MM.yyyy");
    @XmlAttribute
    protected long id;
    @XmlAttribute
    protected String firstName;
    @XmlAttribute
    protected String lastName;
    @XmlElement
    protected String address;
    @XmlElement
    protected String phone;
    @XmlElement
    protected Date dateOfBirth;

    public Human() {
    }

    public Human(long id, String firstName, String lastName, String address, String phone, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(long id, String firstName, String lastName, String address, String phone, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        try {
            this.dateOfBirth = BIRTH_DATE_FORMAT.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
