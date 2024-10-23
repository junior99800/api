CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE event (
    id UUID DEFAULT get_random_uuid() PRIMARY key,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(250) NOT NULL,
    img_url VARCHAR (100) NOT NULL,
    event_url VARCHAR (100) NOT NULL,
    date TIMESTAMP NOT NULL,
    remote BOOLEAN NOt NULL
    
);