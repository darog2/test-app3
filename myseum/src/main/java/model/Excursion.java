package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import model.Client;

import java.util.ArrayList;
import java.util.List;
@Data
@SuperBuilder
public class Excursion {
private List<Client> groupClient=new ArrayList<>();
private List<Lecture> listLecture=new ArrayList<>();

    // }


}
