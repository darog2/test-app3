
import model.Address;
import model.Client;

public class MuseumMein {
    public static void main(String[] args) {
     Client client=Client.builder()
        .name("Dasha")
        .lastName("Pupkina")
             .address(Address.builder()
                     .country("Ukrain")
                     .region("Kharkov")
                     .city("Kharkov")
                     .str("str pushkina")
                     .house(2)
                     .postalCode(054442)
                     .build()
             .dateOfBirth.setDateFormatUtil(formater.parse("11212112").toSrting)
             .build();




    }
}
