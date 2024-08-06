-- Миграции нужны для создания таблицы в базе данных,
-- а также изменения структуры существующей таблицы
-- при изменения формы данных.
CREATE TABLE calendar (
    day INT NOT NULL PRIMARY KEY,
    description VARCHAR(255) NOT NULL
);