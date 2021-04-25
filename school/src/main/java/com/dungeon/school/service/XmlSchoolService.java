package com.dungeon.school.service;

import com.dungeon.school.model.School;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlSchoolService {
    public School loadSchool(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(School.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (School) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    // сохраняем объект в XML файл
    public void saveSchool(School school, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(School.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(school, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
