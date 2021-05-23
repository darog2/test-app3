
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

    BaseEntity(long id,String name,Date registrationDate){
        this.id=id;
        this.name=name;
        this.registrationDate=registrationDate;

    }

    public BaseEntity() {
    }
}
