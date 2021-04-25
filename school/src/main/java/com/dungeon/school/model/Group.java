package com.dungeon.school.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
@Data
@XmlType(propOrder = {"id","classNumber","name","curator","studentList",})
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {
    @XmlAttribute
    private long id;
    @XmlAttribute(name = "number")
    private int classNumber;
    @XmlAttribute
    private String name;
    @XmlElement
    private Teacher curator;
    @XmlElement(name = "Student")
    @XmlElementWrapper(name = "Students")
    private List<Student> studentList;

    public Group() {
        this.studentList = new ArrayList<>();
    }

    public Group(long id, int classNumber, String name, Teacher curator) {
        this();
        this.id = id;
        this.classNumber = classNumber;
        this.name = name;
        this.curator = curator;
    }
}
