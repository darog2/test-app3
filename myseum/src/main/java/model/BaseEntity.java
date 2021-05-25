
package model;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Data
@SuperBuilder

public abstract class BaseEntity {
    private long id;
    private String name;
    private Date registrationDate;

}
