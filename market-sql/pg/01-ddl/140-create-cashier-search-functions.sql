create or replace function
-- f_get_product_id_by_name(VARCHAR)
    f_get_cashier_id_by_name_and_market_id(
    p_name VARCHAR,
    p_last_name VARCHAR,
    p_market_id BIGINT)
    returns INTEGER as '
    SELECT cashier_id
    FROM public.cashiers,
         public.markets
    WHERE cashier_market = market_id
      and market_id =p_market_id
      and cashier_name =p_name
      and cashier_last_name =p_last_name
    LIMIT 1;
' LANGUAGE SQL;

create or replace function
-- f_get_product_id_by_name(VARCHAR)
    f_get_cashier_id_by_name_and_market_name(
    p_name VARCHAR,
    p_last_name VARCHAR,
    p_market_name VARCHAR)
    returns INTEGER as
    --     $$
--     call f_get_cashier_id_by_name_and_market_id(
--         p_name,
--         p_last_name,
--         f_get_market_id_by_name(p_market_name)
--         )
--     $$
--     '
--     SELECT cashier_id
--     FROM public.cashiers,
--          public.markets
--     WHERE cashier_market = market_id
--       and market_name =p_market_name
--       and cashier_name =p_name
--       and cashier_last_name =p_last_name
-- LIMIT 1;
-- '
    LANGUAGE SQL;