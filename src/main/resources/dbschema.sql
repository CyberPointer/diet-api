CREATE TABLE food(
	id bigint primary key NOT NULL,
    food_name varchar(200) NOT NULL,
    food_type varchar(200) NOT NULL,
    kcal INTEGER,
    whey DECIMAL(5,2),
    carbs DECIMAL(5,2),
	fat DECIMAL(5,2)
);

