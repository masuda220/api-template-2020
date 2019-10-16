CREATE ROLE sample_user WITH LOGIN PASSWORD 'to_be_changed';
-- GRANT chemical TO postgres;
CREATE DATABASE sample OWNER = sample_user ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C' TEMPLATE = template0;