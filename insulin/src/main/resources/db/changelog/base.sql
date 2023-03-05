--changeset giampaolo:1

CREATE TABLE glucose_data (
    id INT NOT NULL AUTO_INCREMENT,
    glucose_number FLOAT,
    carbohydrate_number FLOAT,
    dose_number FLOAT,
    user_id INT,
    PRIMARY KEY (id)
);