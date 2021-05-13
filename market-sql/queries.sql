select cashier_name Имя,
       cashier_last_name Фамилия,
       cashier_still_working Работает
from public.cashiers;
select cashier_name Имя,
       cashier_last_name Фамилия,
       market_name Магазин,
       cashier_still_working Работает
from public.cashiers, public.markets
where cashier_market = markets.market_id;


INSERT INTO public.products(product_name, product_price) VALUES
('огурец',1.5),
('ананас',4.5),
('лук',1.9),
('помидор',2.5),
('мясо лось',3.5),
('мясо заяц',5.3),
('курица мясо',9.5),
('капуста',11.5);
SELECT markets.market_name,
       products.product_name,
       public.market_products.mp_in_warehouse
from products,
     markets
         inner join market_products mp
                    on public.markets.market_id= mp.mp_market
         inner join market_products mpp
                    on public.products.product_id = mpp.mp_product;
-- from business-problem
ALTER TABLE public.cashiers
    add column cashier_salary NUMERIC(7,2)  not null
        DEFAULT 1000;
SELECT*
FROM cashiers
WHERE cashier_date_of_birth>'2000-01-01';
SELECT *
FROM cashiers
WHERE cashier_date_of_birth>'1990-01-01'
  and cashier_date_of_birth<'2000-01-01';
SELECT *
FROM cashiers
WHERE cashier_date_of_birth
          BETWEEN '1990-01-01'and '2000-01-01';
SELECT *
FROM cashiers
WHERE cashier_salary<1000;
SELECT *
FROM cashiers
WHERE cashier_salary
          BETWEEN 1000 and 1200;
SELECT *
FROM cashiers
ORDER BY cashier_salary ASC ;
SELECT *
FROM cashiers
LIMIT  3;
SELECT *
FROM cashiers
ORDER BY cashier_salary DESC
LIMIT 3;
SELECT avg(cashier_salary), extract(YEAR from cashier_date_of_employment)
from cashiers
-- group by extract(YEAR from cashier_date_of_employment);
group by 2;

select *
from products
where product_name like '%мясо%'
order by product_price desc;







-- select
-- columns/calculation
-- from
-- tables
-- join
-- where
-- keys
-- conditions
-- having
-- order by
-- limit
