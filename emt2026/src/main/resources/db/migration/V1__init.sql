CREATE TABLE country (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(100),
                         continent VARCHAR(100)
);

CREATE TABLE host (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(100),
                      surname VARCHAR(100),
                      country_id BIGINT REFERENCES country(id)
);

CREATE TABLE accommodation (
                               id SERIAL PRIMARY KEY,
                               name VARCHAR(100),
                               category VARCHAR(50),
                               num_rooms INT,
                               host_id BIGINT REFERENCES host(id)
);