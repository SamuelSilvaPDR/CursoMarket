create table person(
                    id int not null auto_increment,
                    firstname varchar(50) not null,
                    lastname varchar(50) not null,
                    address varchar(50) not null,
                    gender varchar(20) not null,
                    primary key(id))