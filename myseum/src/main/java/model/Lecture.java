package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class Lecture extends BaseEntity {
    private String description;
    private Employee lecturer;
    private Date lectureStart;
    private Date lectureOver;

}
