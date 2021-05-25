DROP FUNCTION IF EXISTS f_get_cashier_id_by_name_and_market_id;
DELIMITER $$
CREATE function
    f_get_cashier_id_by_name_and_market_id(
    p_name VARCHAR(80),
    p_last_name VARCHAR(80),
    p_market_id BIGINT)
    returns INTEGER
    BEGIN
        DECLARE result integer;

        SELECT cashier_id
        INTO result
        FROM cashiers,
         markets
    WHERE cashier_market = market_id
      and market_id =p_market_id
      and cashier_name =p_name
      and cashier_last_name =p_last_name
    LIMIT 1;
        return result;
    end $$
    DELIMITER ;



DROP FUNCTION IF EXISTS f_get_cashier_id_by_name_and_market_name;
DELIMITER $$

CREATE function
    f_get_cashier_id_by_name_and_market_name
(
    p_name VARCHAR(40),
    p_last_name VARCHAR(40),
    p_market_name VARCHAR(60))
returns INTEGER
    BEGIN
        DECLARE result integer;
        SELECT f_get_cashier_id_by_name_and_market_id(
                p_name,
                p_last_name,
                f_get_market_id_by_name(p_market_name)
            )
            INTO result;
        return result;
    end $$
    DELIMITER ;
