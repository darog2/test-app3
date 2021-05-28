
package com.dungeon.museum.model;

import com.dungeon.museum.date.DateFormatUtil;
import lombok.Data;
import lombok.experimental.SuperBuilder;


import java.util.Date;

@Data
@SuperBuilder

public abstract class BaseEntity {
    private long id;

    private String name;
    //todo remove default value after adding database
    private Date registrationDate =
            DateFormatUtil.DATE_AND_TIME.parse(System.currentTimeMillis());

}
