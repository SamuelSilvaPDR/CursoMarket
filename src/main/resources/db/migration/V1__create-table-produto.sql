create table produto(
    id int not null auto_increment,
    nome varchar(100) not null,
    peso varchar(10) not null,
    tipo varchar(20) not null,
    valor int not null,
    validade varchar(50) not null,
    
    primary key(id)
)