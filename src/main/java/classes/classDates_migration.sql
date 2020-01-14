USE chl;
CREATE TABLE classDates(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    type VARCHAR(50),
    date DATETIME,
    seatsBooked INT(5),
    PRIMARY KEY(id)
);
