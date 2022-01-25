CREATE TABLE employee
(
    id              INT(11)         NOT NULL AUTO_INCREMENT,
    name            VARCHAR(100)    NOT NULL,
    age             INT(11)         NOT NULL,
    account_state   VARCHAR(255)    DEFAULT NULL,
    created_date    TIMESTAMP       NOT NULL DEFAULT now(),
    modified_date   TIMESTAMP       NOT NULL DEFAULT now(),
    PRIMARY KEY (id)
);