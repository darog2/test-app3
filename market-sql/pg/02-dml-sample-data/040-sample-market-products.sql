INSERT INTO public.market_products(mp_product, mp_market, mp_in_warehouse) VALUES
(2,f_get_market_id_by_name('ATB #1'),900),
(
    f_get_product_id_by_name('помидор'),
    f_get_market_id_by_name('ATB #1'),
    930
),
(
    f_get_product_id_by_name('мясо лось'),
    f_get_market_id_by_name('ATB #1'),
    10
),
(
    f_get_product_id_by_name('мясо заяц'),
    f_get_market_id_by_name('ATB #1'),
    80
),
(
    f_get_product_id_by_name('огурец'),
    f_get_market_id_by_name('ATB #1'),
    340
),
(
    f_get_product_id_by_name('лук'),
    f_get_market_id_by_name('ATB #1'),
    450
),
(
    f_get_product_id_by_name('капуста'),
    f_get_market_id_by_name('ATB #1'),
    12
);