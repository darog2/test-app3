package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Address {
    private String country;
    private String region;
    private String city;
    private String str;
    private int house;
    private int postalCode;
}
