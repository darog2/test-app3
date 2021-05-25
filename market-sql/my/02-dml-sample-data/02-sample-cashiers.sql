-- сломается если маркет с ид=3 был удалён
INSERT INTO cashiers
(cashier_name,
 cashier_last_name,
 cashier_market,
 cashier_date_of_birth,
 cashier_date_of_employment,
 cashier_salary)
values ('Rachiel','Losiewski',
        f_get_market_id_by_name( 'ATB #1'),
        '1992-01-24','2019-07-22',2178.0),
       ('Kristoffer','Boje',
        f_get_market_id_by_name( 'ATB #1'),
        '1977-12-05','2020-09-26',2319.0),
       ('Adian','Kuca',
        f_get_market_id_by_name( 'ATB #1'),
        '1997-05-13','2019-08-26',1816.0),
       ('Yaseen','Bally',
        f_get_market_id_by_name( 'ATB #1'),
        '1978-04-09','2020-06-15',2025.0),
       ('Yaseen','Siegel',
        f_get_market_id_by_name( 'ATB #1'),
        '1992-09-19','2020-02-26',1511.0),
       ('Saprina','Funchess',
        f_get_market_id_by_name( 'ATB #1'),
        '1993-09-01','2019-07-15',1209.0),
       ('Domanic','Funchess',
        f_get_market_id_by_name( 'ATB #1'),
        '1980-05-07','2020-12-13',1371.0),
       ('Shakema','Bergmann',
        f_get_market_id_by_name( 'ATB #1'),
        '1986-04-29','2019-07-14',2417.0),
       ('Yoko','Kasperski',
        f_get_market_id_by_name( 'ATB #1'),
        '1998-04-05','2020-01-12',2138.0),
       ('Nikisha','Siegel',
        f_get_market_id_by_name( 'ATB #1'),
        '1976-08-21','2019-01-12',1589.0),
       ('Shakema','Kasperski',
        f_get_market_id_by_name( 'ATB #1'),
        '1975-02-08','2020-12-05',1312.0),
       ('Yoko','Bergmann',
        f_get_market_id_by_name( 'ATB #1'),
        '1988-04-25','2020-05-27',1258.0),
       ('Shakema','Skora',
        f_get_market_id_by_name( 'ATB #1'),
        '1997-02-02','2020-06-19',1626.0),
       ('Arnesha','Funchess',
        f_get_market_id_by_name( 'ATB #1'),
        '1989-03-14','2020-09-07',1460.0),
       ('Kristoffer','Soldan',
        f_get_market_id_by_name( 'ATB #1'),
        '1976-06-30','2019-11-15',1248.0),
       ('Edurdo','Ginoza',
        f_get_market_id_by_name( 'ATB #2'),
        '1995-02-10','2020-12-30',2340.0),
       ('Shakema','Gibney',
        f_get_market_id_by_name( 'ATB #2'),
        '1992-04-27','2020-06-01',1305.0),
       ('Winfield','Dederick',
        f_get_market_id_by_name( 'ATB #2'),
        '1999-03-25','2019-01-25',1226.0),
       ('Karimah','Funchess',
        f_get_market_id_by_name( 'ATB #2'),
        '1996-11-23','2019-11-05',1359.0),
       ('Shawnae','Goligoski',
        f_get_market_id_by_name( 'ATB #2'),
        '1983-02-18','2020-08-01',1377.0),
       ('Nikisha','Curie',
        f_get_market_id_by_name( 'ATB #2'),
        '1986-08-17','2019-08-22',1741.0),
       ('Shawnae','Curie',
        f_get_market_id_by_name( 'ATB #2'),
        '1992-08-17','2020-01-19',1244.0),
       ('Frederica','Losiewski',
        f_get_market_id_by_name( 'ATB #2'),
        '1993-05-31','2019-11-22',2473.0);
INSERT INTO cashiers
(cashier_name,
 cashier_last_name,
 cashier_market,
 cashier_date_of_birth,
 cashier_date_of_employment,
 cashier_salary)
values
('Aletta','Curie',
 f_get_market_id_by_name( 'ATB #2'),
 '1976-05-27','2019-11-25',1847.0),
('Frederica','Trane',
 f_get_market_id_by_name( 'ATB #2'),
 '1995-02-27','2020-04-03',1990.0),
('Arnesha','Boender',
 f_get_market_id_by_name( 'ATB #2'),
 '1991-06-06','2019-04-03',1376.0),
('Edurdo','Covington',
 f_get_market_id_by_name( 'ATB #2'),
 '1975-07-31','2020-04-18',1378.0),
('Adian','Geer',
 f_get_market_id_by_name( 'ATB #2'),
 '1981-06-25','2020-06-14',2340.0),
('Nikisha','Dederick',
 f_get_market_id_by_name( 'ATB #2'),
 '1996-11-09','2020-11-29',2055.0),
('Yoko','Ginoza',
 f_get_market_id_by_name( 'ATB #2'),
 '1996-05-31','2019-06-26',2442.0),
('Shakema','Benshoof',
 f_get_market_id_by_name( 'ATB #3'),
 '1993-02-26','2019-10-09',1251.0),
('Frederica','Kasperski',
 f_get_market_id_by_name( 'ATB #3'),
 '1985-12-12','2019-03-22',1465.0),
('Kelli','Barriere',
 f_get_market_id_by_name( 'ATB #3'),
 '1985-01-23','2020-03-14',1293.0),
('Edurdo','Kempinski',
 f_get_market_id_by_name( 'ATB #3'),
 '1985-06-22','2020-09-23',1851.0),
('Frederica','Dederick',
 f_get_market_id_by_name( 'ATB #3'),
 '1986-07-08','2019-04-20',2413.0),
('Karimah','Boje',
 f_get_market_id_by_name( 'ATB #3'),
 '1994-12-24','2020-09-02',1734.0),
('Kristoffer','Barriere',
 f_get_market_id_by_name( 'ATB #3'),
 '1978-08-28','2020-07-19',1731.0),
('Kelli','Bernardo',
 f_get_market_id_by_name( 'ATB #3'),
 '1995-08-17','2020-01-07',2031.0),
('Edurdo','Negley',
 f_get_market_id_by_name( 'ATB #3'),
 '1984-04-03','2019-08-02',1338.0),
('Isom','Goligoski',
 f_get_market_id_by_name( 'ATB #3'),
 '1997-01-24','2020-08-14',1687.0),
('Deshaun','Geer',
 f_get_market_id_by_name( 'ATB #3'),
 '1989-08-23','2019-05-15',1324.0),
('Shauntrice','Benshoof',
 f_get_market_id_by_name( 'ATB #3'),
 '1975-05-29','2019-06-18',2381.0),
('Saprina','Griffard',
 f_get_market_id_by_name( 'ATB #3'),
 '2001-08-26','2019-09-29',2205.0),
('Agueda','Bair',
 f_get_market_id_by_name( 'ATB #3'),
 '1994-03-15','2019-09-19',2075.0),
('Winfield','Skora',
 f_get_market_id_by_name( 'ATB #4'),
 '1989-09-25','2020-07-04',1345.0),
('Frederica','Gut',
 f_get_market_id_by_name( 'ATB #4'),
 '1998-03-12','2019-10-18',2112.0),
('Edurdo','Gibney',
 f_get_market_id_by_name( 'ATB #4'),
 '1990-07-21','2019-07-02',1303.0),
('Domanic','Ginoza',
 f_get_market_id_by_name( 'ATB #4'),
 '1988-12-20','2020-10-13',2210.0),
('Edurdo','Bair',
 f_get_market_id_by_name( 'ATB #4'),
 '1976-08-30','2020-09-18',1374.0),
('Iesha','Geer',
 f_get_market_id_by_name( 'ATB #4'),
 '1985-05-24','2019-04-19',1555.0),
('Rachiel','Negley',
 f_get_market_id_by_name( 'ATB #4'),
 '2002-01-13','2019-05-16',1226.0),
('Aletta','Bernardo',
 f_get_market_id_by_name( 'ATB #4'),
 '1983-08-28','2020-06-18',1528.0),
('Shawnae','Soldan',
 f_get_market_id_by_name( 'ATB #4'),
 '1982-03-03','2019-02-08',1826.0),
('Suanne','Goligoski',
 f_get_market_id_by_name( 'ATB #4'),
 '1982-05-13','2020-11-01',2133.0),
('Frederica','Boje',
 f_get_market_id_by_name( 'ATB #4'),
 '1992-01-13','2019-10-03',1903.0),
('Aletta','Ginoza',
 f_get_market_id_by_name( 'ATB #4'),
 '1984-03-20','2020-09-22',1239.0),
('Yoko','Boje',
 f_get_market_id_by_name( 'ATB #4'),
 '1988-04-17','2020-06-13',1988.0);
