package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder

public class Client extends BaseEntity {
    private String lastName;
    private String numberPhone;
    private Date age;



}
