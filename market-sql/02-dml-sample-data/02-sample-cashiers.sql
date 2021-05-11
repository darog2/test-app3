-- сломается если маркет с ид=3 был удалён
INSERT INTO public.cashiers
(cashier_name,
 cashier_last_name,
 cashier_market,
 cashier_date_of_birth,
 cashier_date_of_employment)
values ('Ivan','Ivanov',3,'1995-08-17','2019-06-19'),
       ('John','Doe',
        (select market_id
         from public.markets
         where market_name = 'ATB #3'),
       '1982-05-19','2019-06-11');

