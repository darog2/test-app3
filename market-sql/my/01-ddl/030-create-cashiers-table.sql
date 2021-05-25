CREATE TABLE cashiers
(
    cashier_id
                      BIGINT      not null primary key
        unique auto_increment,
    cashier_name      VARCHAR(40) not null,
    cashier_last_name VARCHAR(40) not null,
    cashier_market    BIGINT      not null
);
ALTER TABLE cashiers
    add constraint cashier_fullname_uc
        UNIQUE (cashier_name, cashier_last_name);
