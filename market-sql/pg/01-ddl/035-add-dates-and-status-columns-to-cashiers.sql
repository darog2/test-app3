ALTER TABLE public.cashiers
    add column cashier_date_of_birth DATE;
ALTER TABLE public.cashiers
    add column cashier_date_of_employment DATE;
ALTER TABLE public.cashiers
    add column cashier_still_working BOOLEAN DEFAULT TRUE;