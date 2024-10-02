CREATE TABLE IF NOT EXISTS USERS (
    id UUID DEFAULT random_uuid(),          -- ID field with auto-increment
    username VARCHAR(255) UNIQUE NOT NULL,  -- Username field
    password VARCHAR(255) NOT NULL,         -- Password field
    email VARCHAR(255) UNIQUE NOT NULL,     -- Email field
    phone VARCHAR(20),                      -- Phone field
    first_name VARCHAR(255) NOT NULL,       -- First name field
    last_name VARCHAR(255) NOT NULL         -- Last name field
 );