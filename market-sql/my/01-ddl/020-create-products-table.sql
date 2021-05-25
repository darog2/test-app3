CREATE TABLE products
(
    product_id
        BIGINT  not null primary key
        unique auto_increment,
    product_name
        VARCHAR(40)   not null,
    product_price
        NUMERIC(5,2)  not null
);
ALTER TABLE products
    add constraint product_name_uc UNIQUE (product_name);