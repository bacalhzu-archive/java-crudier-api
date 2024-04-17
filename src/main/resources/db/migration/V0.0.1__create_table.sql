CREATE TABLE t_user (
    id              UUID            PRIMARY KEY,
    username        VARCHAR(32)     UNIQUE NOT NULL,
    name            VARCHAR(100)    NOT NULL,
    age             INTEGER         NOT NULL,
    favorite_thing  VARCHAR(100)    NOT NULL,
    is_developer    BOOL            NOT NULL
)