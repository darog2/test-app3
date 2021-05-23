package model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Museum extends BaseEntity{
    private String description;

}
