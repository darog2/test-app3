package com.dungeon.person;

import com.dungeon.person.config.AddressGeneratorConfigurator;
import com.dungeon.person.config.Configurator;
import com.dungeon.person.config.PersonCreatorConfigurator;
import com.dungeon.person.generators.impl.RandomPersonGenerator;
import com.dungeon.person.model.Human;
import com.dungeon.person.util.DateFormatUtil;

import java.text.ParseException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RandomHumanApplication {

    public static final String HUMAN_TEMPLATE = " ('%s','%s',\n        f_get_market_id_by_name( 'ATB #%d'),%n       '%s','%s',%s),%n";

    public static void main(String[] args) {
        try {
            RandomPersonGenerator personGenerator =
                    Configurator
                            .configureHumanGeneratorAlgorithm(
                                    AddressGeneratorConfigurator
                                            .configurator()
                                            .streets(30)
                                            .oneCountryCities("Ukraine", "Kiev", "Kharkov", "Lvov")
                                            .maxApartmentNumber(95)
                                            .maxHouseNumber(150)
                                            .build(),
                                    PersonCreatorConfigurator
                                            .configurePersonalDataGenerationAlgorithm()
                                            .firstNames(30)
                                            .lastNames(30)
                                            .salary(1200, 2500)
                                            .birthDates("01.01.1975", "01.01.2003")
                                            .employedDates("01.01.2019", "01.01.2021")
                            );

            StringBuilder insert = new StringBuilder("INSERT INTO public.cashiers\n" +
                    "(cashier_name,\n" +
                    " cashier_last_name,\n" +
                    " cashier_market,\n" +
                    " cashier_date_of_birth,\n" +
                    " cashier_date_of_employment,\n" +
                    " cashier_salary)\n" +
                    "values");
            Set<Human>humans=new HashSet<>();
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < 15; j++) {
                    Human human = personGenerator.generate();
                    if (humans.add(human)) {
                        insert.append(String.format(HUMAN_TEMPLATE,
                                human.getName(),
                                human.getLastName(),
                                i,
                                DateFormatUtil.SQL_INSERT_DATE_FORMAT.format(human.getBirthDate()),
                                DateFormatUtil.SQL_INSERT_DATE_FORMAT.format(human.getEmployedDate()),
                                human.getSalary()));
                    }
                }
            }
            System.out.println(insert);
            System.out.println();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
