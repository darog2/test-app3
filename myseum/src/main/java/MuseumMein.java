
import com.dungeon.museum.date.DateFormatUtil;
import com.dungeon.museum.model.Address;
import com.dungeon.museum.model.Client;

import java.text.ParseException;

public class MuseumMein {
    public static void main(String[] args) {
        try {
            Client client=Client.builder()
               .name("Dasha")
               .lastName("Pupkina")
                    .address(Address.builder()
                            .country("Ukrain")
                            .region("Kharkov")
                            .city("Kharkov")
                            .str("str pushkina")
                            .house(2)
                            .postalCode("054442")
                            .build()
                    )// don't forget to close
       //wtf?             .dateOfBirth.setDateFormatUtil(formater.parse("11212112").toSrting)
                    .dateOfBirth(DateFormatUtil.ONLY_DATE.parse("01-02-1985"))
                    .build();
        } catch (ParseException e) {
            System.out.println("client have incorrect date of birth!!!");
            e.printStackTrace();
        }


    }
}
