ALTER TABLE consumption
    ADD CONSTRAINT consumption_client_constr FOREIGN KEY (id_client) REFERENCES client (id);

ALTER TABLE consumption
    ADD CONSTRAINT consumption_service_type_constr FOREIGN KEY (id_service_type) REFERENCES service_type (id);