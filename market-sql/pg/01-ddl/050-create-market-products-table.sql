CREATE TABLE public.market_products
(
    mp_product      BIGINT   not null,
    mp_market       BIGINT   not null,
    mp_in_warehouse SMALLINT not null
);
ALTER TABLE public.market_products
    add constraint market_product_uc UNIQUE (mp_product, mp_market);
