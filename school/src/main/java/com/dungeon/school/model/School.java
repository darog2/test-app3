package com.dungeon.school.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@Data
@XmlRootElement(name="School")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id","name","address","city","country","director","groupList","teacherList"})
public class School {
    @XmlAttribute
    private long id;
    @XmlAttribute
    private String name;
    @XmlElement
    private String address;
    @XmlElement
    private String city;
    @XmlElement
    private String country;
    @XmlElement
    private Teacher director;
    @XmlElement(name = "Group")
    @XmlElementWrapper(name="Groups")
    private List<Group> groupList;
    @XmlElement(name="Teacher")
    @XmlElementWrapper(name = "Teachers")
    private List<Teacher> teacherList;

    public School() {
        this.teacherList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public School(long id, String name, String address, String city, String country, Teacher director) {
        this();
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.director = director;
    }
}
