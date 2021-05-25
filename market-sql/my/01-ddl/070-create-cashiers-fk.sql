ALTER TABLE cashiers
    add constraint cashier_market_fk
        foreign key (cashier_market)
            references markets (market_id)
            ON DELETE RESTRICT;