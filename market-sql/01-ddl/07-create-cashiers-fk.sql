ALTER TABLE public.cashiers
    add constraint cashier_market_fk
        foreign key (cashier_market)
            references public.markets (market_id)
            ON DELETE RESTRICT;