ALTER TABLE receipt_products
    add constraint rp_receipt_fk
        foreign key (rp_receipt)
            references receipts (receipt_id)
            ON DELETE RESTRICT;
ALTER TABLE receipt_products
    add constraint rp_product_fk
        foreign key (rp_product)
            references products (product_id)
            ON DELETE RESTRICT;
