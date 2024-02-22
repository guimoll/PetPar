create table  usuarios(
                         id bigint not null auto_increment,
                         nome varchar(100) not null,
                         cpf varchar(11) not null,
                         nascimento date not null,
                         email varchar(255),
                         telefone varchar(11),
                         logradouro varchar(100) not null,
                         bairro varchar(100) not null,
                         cep varchar(9) not null,
                         complemento varchar(100),
                         numero varchar(20) not null,
                         primary key(id)
);

