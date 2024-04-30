-- Modifications To user_type
INSERT INTO user_type (type) VALUES ('USER'), ('ADMIN');
-- Poner el usuario que va a conectarse a la base de datos
--REVOKE INSERT, UPDATE, DELETE ON user_type FROM 'username'@'hostname';


INSERT INTO user (total_authorization, user_type_id, email, lastname, name, address, password) VALUES (true, 2, 'admin@gmail.com', 'Admin', 'Admin', 'Direccion', 'admin');



