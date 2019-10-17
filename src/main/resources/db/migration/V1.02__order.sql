DROP SCHEMA IF EXISTS 注文 CASCADE;
CREATE SCHEMA 注文;
CREATE TABLE 注文.注文
(
    識別番号 UUID PRIMARY KEY,
    購入者氏名 VARCHAR(50) NOT NULL,
    登録日時 TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP

);

COMMENT ON TABLE 注文.注文 IS '注文テーブル';
