USE ecommerce_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS products;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    quantity_in_stock INT NOT NULL,
    description VARCHAR(255) NOT NULL
);

INSERT INTO users
(first_name, last_name, email, phone_number, username, password)
VALUES
('Admin', 'User', 'admin@email.com', '1234567890', 'admin', 'password');

INSERT INTO products
(name, category, price, quantity_in_stock, description)
VALUES
('Smartphone', 'Electronics', 699.99, 12, 'Modern smartphone with large display.'),
('Hoodie', 'Clothing', 49.99, 25, 'Comfortable everyday hoodie.'),
('Dumbbell Set', 'Fitness Gear', 89.99, 8, 'Adjustable dumbbell set for home workouts.');