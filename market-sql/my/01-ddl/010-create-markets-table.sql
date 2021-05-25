CREATE TABLE markets
(
    market_id
        BIGINT  not null primary key
        unique auto_increment,
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