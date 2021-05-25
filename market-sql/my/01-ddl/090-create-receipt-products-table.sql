CREATE TABLE receipt_products
(
    rp_receipt  BIGINT   not null,
    rp_product  BIGINT   not null,
    rp_quantity SMALLINT not null

);
ALTER TABLE receipt_products
    add constraint receipt_products_uc UNIQUE (rp_product, rp_receipt);