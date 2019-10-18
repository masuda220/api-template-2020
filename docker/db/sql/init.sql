CREATE ROLE sample_user WITH LOGIN PASSWORD 'to_be_changed';
-- GRANT chemical TO postgres;
CREATE DATABASE sample OWNER = sample_user TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';