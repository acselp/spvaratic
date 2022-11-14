ALTER TABLE counter
    ADD CONSTRAINT client_counter_constr FOREIGN KEY (id_client) REFERENCES client (id);