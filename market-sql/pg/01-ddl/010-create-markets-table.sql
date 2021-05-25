CREATE TABLE public.markets
(
    market_id
        BIGINT unique not null primary key
        GENERATED BY DEFAULT AS IDENTITY,
    market_name
        VARCHAR(60)   not null,
    market_rows_count
        SMALLINT      not null,
    market_address
        VARCHAR(120)
        unique        not null,
    market_zipcode
        NUMERIC(5)
);