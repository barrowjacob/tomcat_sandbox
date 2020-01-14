USE chl;
CREATE TABLE users(
    id INT NOT NULL AUTO_INCREMENT,
    class_id INT UNSIGNED NOT NULL,
    first_name VARCHAR(25),
    last_name VARCHAR(50),
    phone_number VARCHAR(30),
    email VARCHAR(50),
    PRIMARY KEY(id),
    FOREIGN KEY(class_id) REFERENCES classDates (id)
)