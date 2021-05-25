ALTER TABLE receipts
    add constraint receipt_cashier_fk
        foreign key (receipt_cashier)
            references cashiers (cashier_id)
            ON DELETE RESTRICT;
