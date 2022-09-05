CREATE DATABASE spy_glass;
USE spy_glass;

START TRANSACTION;

DROP TABLES IF EXISTS goal;

CREATE TABLE goal
(
	goal_id int NOT NULL AUTO_INCREMENT,
    goal_name varchar (50) NOT NULL,
	goal_description varchar(100) NOT NULL,
    image_path varchar(1024) NOT NULL,
    target_date date NOT NULL,
    target_amount float NOT NULL,
    current_amount float NOT NULL,
    
    CONSTRAINT PK_goal PRIMARY KEY (goal_id)
);

COMMIT;
-- ROLLBACK;







COMMIT;
-- ROLLBACK;