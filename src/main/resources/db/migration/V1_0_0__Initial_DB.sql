CREATE TABLE client
(
    id        INT AUTO_INCREMENT NOT NULL,
    fname     VARCHAR(255)       NULL,
    lname     VARCHAR(255)       NULL,
    nr_cont   INT                NOT NULL,
    nr_contor INT                NOT NULL,
    nr_copii  INT                NOT NULL,
    CONSTRAINT pk_client PRIMARY KEY (id)
);

ALTER TABLE client
    ADD CONSTRAINT uc_client_id UNIQUE (id);

CREATE TABLE consumption
(
    id              INT AUTO_INCREMENT      NOT NULL,
    id_client       INT                     NOT NULL,
    id_service_type INT                     NOT NULL,
    paid            FLOAT                   NOT NULL,
    paid_on         timestamp DEFAULT NOW() NOT NULL,
    CONSTRAINT pk_consumption PRIMARY KEY (id)
);

ALTER TABLE consumption
    ADD CONSTRAINT uc_consumption_id UNIQUE (id);

CREATE TABLE service_type
(
    id    INT AUTO_INCREMENT NOT NULL,
    title VARCHAR(255)       NULL,
    price FLOAT              NOT NULL,
    CONSTRAINT pk_servicetype PRIMARY KEY (id)
);

ALTER TABLE service_type
    ADD CONSTRAINT uc_servicetype_id UNIQUE (id);