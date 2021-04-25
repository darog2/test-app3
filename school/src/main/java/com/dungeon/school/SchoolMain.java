package com.dungeon.school;

import com.dungeon.school.model.Group;
import com.dungeon.school.model.School;
import com.dungeon.school.model.Student;
import com.dungeon.school.model.Subject;
import com.dungeon.school.model.Teacher;
import com.dungeon.school.service.XmlSchoolService;

import java.util.Date;

public class SchoolMain {

    public static void main(String[] args) {
        Subject subject=new Subject(1,"algebra","this is algebra");
        Subject subject1 =new Subject(2,"geometry","science about figures");
        Subject subject2 =new Subject(3,"english","most popular language in whole world");
        Subject subject3=new Subject(4,"French","there are a lot of cool literature");
        Teacher teacher1=new Teacher(2,
                "Jack",
                "Wolfskin",
                "str.pushkina h. colotushkina2",
                "123 582 9541",
                new Date(),
                "Oxford");
        Teacher teacher2=new Teacher(1,
                "John",
                "Doe",
                "str.pushkina h. colotushkina",
                "123 221 2211",
                new Date(),
                "KPI");
        teacher1.getSubjectList().add(subject);
        teacher1.getSubjectList().add(subject1);
        teacher2.getSubjectList().add(subject2);
        teacher2.getSubjectList().add(subject3);
        Student student=new Student(1,"Ivan","Ivanov","river str. h.11 fl.25","5564564","19.02.2005");
        Student student1=new Student(2,"James","Ackerley","river str. h.11 fl.215","5564564","21.03.2005");
        Student student2=new Student(3,"Robert","Backerly","river str. h.11 fl.225","5564564","12.04.2005");
        Student student3=new Student(4,"John","Eckerman","river str. h.11 fl.72","5564564","05.05.2005");
        Student student4=new Student(5,"Joseph","Backermann","river str. h.11 fl.45","5564564","15.06.2005");
        Student student5=new Student(6,"Andrew","Dackers","river str. h.11 fl.32","5564564","18.02.2005");
        Student student6=new Student(7,"Ryan","Packerson","river str. h.11 fl.74","5564564","28.06.2005");
        Student student7=new Student(8,"Brandon","Rackert","river str. h.11 fl.83","5564564","07.08.2005");
        Student student8=new Student(9,"Jason","Ackison","river str. h.11 fl.96","5564564","09.11.2005");
        Student student9=new Student(10,"Justin","Nackiss","river str. h.11 fl.121","5564564","02.02.2005");
        Student student10=new Student(11,"Sarah","Yackland","river str. h.11 fl.17","5564564","05.02.2005");
        Student student11=new Student(12,"William","Facklen","river str. h.11 fl.1","5564564","17.12.2005");
        Student student12=new Student(13,"Jonathan","Ackles","river str. h.11 fl.89","5564564","22.02.2005");
        Group group1=new Group(1,9,"A",teacher1);
        Group group2=new Group(2,9,"B",teacher2);
        group1.getStudentList().add(student);
        group1.getStudentList().add(student1);
        group1.getStudentList().add(student2);
        group1.getStudentList().add(student3);
        group1.getStudentList().add(student4);
        group1.getStudentList().add(student5);
        group1.getStudentList().add(student6);
        group2.getStudentList().add(student7);
        group2.getStudentList().add(student8);
        group2.getStudentList().add(student9);
        group2.getStudentList().add(student10);
        group2.getStudentList().add(student11);
        group2.getStudentList().add(student12);
        School school=new School(1,"Prison 36","Baker str.3","Magadan","Nibiru",teacher1);
        school.getTeacherList().add(teacher1);
        school.getTeacherList().add(teacher2);
        school.getGroupList().add(group1);
        school.getGroupList().add(group2);

        XmlSchoolService service =new XmlSchoolService();
        service.saveSchool(school,"school.xml");


    }
}
