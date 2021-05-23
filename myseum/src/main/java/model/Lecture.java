package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Lecture extends BaseEntity {
    private String description;
    private String lecturer;
    private int lectureStart;
    private int lectureOver;

}
