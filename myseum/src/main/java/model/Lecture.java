package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Lecture extends BaseEntity {
    private String description;
    private String lecturer;// todo: is lecturer an employee of museum?
    private int lectureStart;//todo: int time?
    private int lectureOver; //todo: int time?

}
