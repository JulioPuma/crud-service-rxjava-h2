-- Crear un esquema
CREATE SCHEMA IF NOT EXISTS "business";

-- Crear una tabla en el esquema
CREATE TABLE "business"."user" (
    "id" INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    "email" VARCHAR(255) NOT NULL,
    "name" VARCHAR(255) NOT NULL
);