CREATE TABLE job (
     id SERIAL,
     type VARCHAR(255) NOT NULL ,
     company VARCHAR(255) NOT NULL,
     logo VARCHAR(255),
     url VARCHAR(255),
     position VARCHAR(255) NOT NULL,
     location VARCHAR(255) NOT NULL,
     description VARCHAR(1000),
     how_to_apply VARCHAR(1000),
     token VARCHAR(255) NOT NULL,
     is_public TINYINT(1) NOT NULL,
     is_activated TINYINT(1) NOT NULL,
     email VARCHAR(255) NOT NULL,
     expires_at DATETIME NOT NULL,
     created_at DATETIME NOT NULL,
     updated_at DATETIME NOT NULL,
     PRIMARY KEY (id)
);