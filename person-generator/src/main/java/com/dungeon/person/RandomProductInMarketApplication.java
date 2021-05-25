package com.dungeon.person;

import com.dungeon.person.generators.impl.RandomIntInRangeGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomProductInMarketApplication {
    public static final List<String> productNames =
            Collections.unmodifiableList(Arrays.asList(
                    "огурец",
                    "ананас",
                    "лук",
                    "помидор",
                    "мясо лось",
                    "мясо заяц",
                    "курица мясо",
                    "капуста",
                    "Картофель",
                    "Морковь",
                    "Чеснок",
                    "Петрушка",
                    "Укроп",
                    "Яблоки",
                    "бананы",
                    "Масло сливочное",
                    "Кефир",
                    "Молоко детское",
                    "Сметана",
                    "Творог",
                    "Сыр",
                    "Горчица",
                    "Малиновое варенье",
                    "Томатная паста",
                    "Рыбная консерва",
                    "Консервированный горошек",
                    "Консервированная кукуруза",
                    "Детское питание",
                    "Сгущенка",
                    "Мед",
                    "Яйца",
                    "Масло растительное",
                    "Соевый соус",
                    "Уксус обычный",
                    "Баллончик со сливками",
                    "Кошачий корм Вискас",
                    "Фрикадельки полуфабрикат",
                    "Котлеты полуфабрикат",
                    "Суповой набор куриный",
                    "Суповой набор мясной",
                    "Готовый мясной бульон",
                    "Готовый куриный бульон",
                    "Курица бедра",
                    "Курица окорочка",
                    "Куриное филе",
                    "Свинина порционная по 300 г",
                    "Сало",
                    "Стручковая фасоль",
                    "Маргарин",
                    "Сливочное масло",
                    "смородина",
                    "клубника",
                    "клюква",
                    "Отварные грибы",
                    "Шпинат",
                    "Слоеное тесто",
                    "лосось",
                    "селедка",
                    "карп",
                    "карась",
                    "толстолоб",
                    "семга",
                    "Крабовые палочки",
                    "Мука пшеничная",
                    "Мука ржаная",
                    "Дрожжи сухие",
                    "Сода",
                    "Разрыхлитель теста",
                    "Сахар обычный",
                    "Сахар коричневый",
                    "Сахарная пудра",
                    "Желатин",
                    "Горький шоколад – 100 г",
                    "Крахмал",
                    "Масло оливковое",
                    "Гречка",
                    "Перловка",
                    "Рис",
                    "Овсяные хлопья",
                    "Манка",
                    "Кукурузная крупа",
                    "Макароны спагетти",
                    "Макароны спиральки",
                    "Горох",
                    "Фасоль",
                    "Панировочные сухари",
                    "Сухие грибы",
                    "Ваниль",
                    "Корица",
                    "Карри",
                    "Черный перец",
                    "Красный перец",
                    "Соль",
                    "Паприка",
                    "Куркума",
                    "Лавровый лист",
                    "Чай",
                    "кофе",
                    "Кофе растворимый",
                    "Чай черный",
                    "Чай зеленый",
                    "Чай мятный",
                    "Какао порошок")
            );
    private static final String INSERT_HEADER = "INSERT INTO market_products(mp_product, mp_market, mp_in_warehouse) VALUES";
    private static final String VALUE = "(\n" +
            "    f_get_product_id_by_name('%s'),\n" +
            "    f_get_market_id_by_name('ATB #%d'),\n" +
            "    %5d\n" +
            "),";
    public static void main(String[] args) {
        StringBuilder insert = new StringBuilder(INSERT_HEADER);
        for (int i = 1; i <6 ; i++) {
            for (int j = 0; j <productNames.size() ; j++) {
                RandomIntInRangeGenerator chance= new RandomIntInRangeGenerator(0,100);
                if(chance.generate()<30){
                    continue;
                }else {
                    int amount = ThreadLocalRandom.current().nextInt(1,5000);
                    insert.append(String.format(VALUE,productNames.get(j),i,amount));
                }

            }

        }
        System.out.println(insert.toString());
    }
}
