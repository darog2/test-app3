create or replace function
    f_get_market_id_by_name(VARCHAR)
    returns INTEGER as'
    select market_id
    from public.markets
    where market_name = $1
    limit 1;
'LANGUAGE SQL;

create or replace function
-- f_get_product_id_by_name(VARCHAR)
f_get_product_id_by_name(_name VARCHAR)
returns INTEGER as'
select product_id
from public.products
-- where product_name = $1
where product_name = _name
limit 1;
'LANGUAGE SQL;