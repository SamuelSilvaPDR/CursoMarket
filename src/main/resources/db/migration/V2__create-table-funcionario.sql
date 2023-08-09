create table funcionario(
                    id int not null auto_increment,
                    nome varchar(100) not null,
                    cpf varchar(11) not null,
                    atua varchar(20) not null,
                    data_Nasc varchar(30) not null,
                    telefone varchar(12) not null,
                    primary key(id))