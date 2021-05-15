-- сломается если маркет с ид=3 был удалён
INSERT INTO public.cashiers
(cashier_name,
 cashier_last_name,
 cashier_market,
 cashier_date_of_birth,
 cashier_date_of_employment,
 cashier_salary)
values ('Ivan','Ivanov',3,'1995-08-17','2019-06-19',1150),
       ('John','Doe',
        f_get_market_id_by_name( 'ATB #3'),
       '1999-03-01','2019-02-11',850),
       ('John','Brown',
        (select market_id
         from public.markets
         where market_name = 'ATB #3'),
       '2000-11-11','2019-05-11',980),
       ('Jack','Doe',
        (select market_id
         from public.markets
         where market_name = 'ATB #3'),
       '2001-05-19','2019-03-11',1125),
       ('Eugene','Petrov',
        (select market_id
         from public.markets
         where market_name = 'ATB #3'),
       '1998-12-02','2020-01-11',1346);

