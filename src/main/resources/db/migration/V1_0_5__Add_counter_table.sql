CREATE TABLE counter
(
    id                  INT AUTO_INCREMENT      NOT NULL,
    id_client           INT                     NOT NULL,
    apa_curent          INT                     NOT NULL,
    salubrizare_curent  INT                     NOT NULL,
    added_on            timestamp DEFAULT NOW() NOT NULL,

    CONSTRAINT pk_counter PRIMARY KEY (id)
);

ALTER TABLE counter
    ADD CONSTRAINT uc_counter_id UNIQUE (id);