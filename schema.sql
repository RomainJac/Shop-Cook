CREATE DATABASE IF NOT EXISTS shopcook;
USE shopcook;
CREATE TABLE IF NOT EXISTS ingredients(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    nutriscore FLOAT,
    calories INT
    );
CREATE TABLE IF NOT EXISTS recipes(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    image VARCHAR(255),
    calories INT
    );
