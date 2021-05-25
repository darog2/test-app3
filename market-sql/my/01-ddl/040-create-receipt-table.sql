CREATE TABLE receipts
(
    receipt_id BIGINT not null primary key
        unique auto_increment,
    receipt_date TIMESTAMP default now(),
    receipt_cashier BIGINT not null
);