-- сломается если маркет с ид=3 был удалён
INSERT INTO public.cashiers
(cashier_name,
 cashier_last_name,
 cashier_market)
values ('Ivan',
        'Ivanov',
        3);
-- найдёт и привяжет ид маркета по названию
INSERT INTO public.cashiers
(cashier_name,
 cashier_last_name,
 cashier_market)
values ('John',
        'Doe',
        (select market_id
         from public.markets
         where market_name = 'ATB #3')
       );

