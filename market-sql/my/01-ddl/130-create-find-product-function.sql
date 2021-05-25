DROP FUNCTION IF EXISTS f_get_product_id_by_name;
DELIMITER $$
CREATE function
    f_get_product_id_by_name(_name VARCHAR(80))
    returns INTEGER
BEGIN
    DECLARE result integer;
    select product_id
    into result
    from products
    where product_name = _name
    limit 1;
    return result;
end $$
DELIMITER ;
