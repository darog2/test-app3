create view cashiers_workplaces as
select cashier_name,
       cashier_last_name,
       m.market_name,
       m.market_address
from cashiers
         inner join markets m
                    on cashiers.cashier_market = m.market_id;