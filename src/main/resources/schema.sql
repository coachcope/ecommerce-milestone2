USE ecommerce_db;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    quantity_in_stock INT NOT NULL,
    description VARCHAR(255) NOT NULL
);

INSERT INTO users (first_name, last_name, email, phone_number, username, password)
SELECT 'Admin', 'User', 'admin@email.com', '1234567890', 'admin', 'password'
WHERE NOT EXISTS (SELECT 1 FROM users WHERE username = 'admin');

INSERT INTO products (name, category, price, quantity_in_stock, description)
SELECT 'Smartphone', 'Electronics', 699.99, 12, 'Modern smartphone with large display.'
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Smartphone');

INSERT INTO products (name, category, price, quantity_in_stock, description)
SELECT 'Hoodie', 'Clothing', 49.99, 25, 'Comfortable everyday hoodie.'
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Hoodie');

INSERT INTO products (name, category, price, quantity_in_stock, description)
SELECT 'Dumbbell Set', 'Fitness Gear', 89.99, 8, 'Adjustable dumbbell set for home workouts.'
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Dumbbell Set');

