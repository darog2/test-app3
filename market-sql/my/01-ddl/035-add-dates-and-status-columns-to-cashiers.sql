ALTER TABLE cashiers
    add column cashier_date_of_birth DATE;
ALTER TABLE cashiers
    add column cashier_date_of_employment DATE;
ALTER TABLE cashiers
    add column cashier_still_working BOOLEAN DEFAULT TRUE;