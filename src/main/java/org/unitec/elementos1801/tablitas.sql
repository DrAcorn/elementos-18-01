

create table mensajito(id integer primary key auto_increment,
                       titulo varchar(50), cuerpo varchar(250));

select * from mensajito;

delete from usuario;
delete from direccion;
drop table direccion;
drop table usuario;
create table usuario(cuenta integer primary key,
nombre varchar(60), email varchar(60));

create table direccion(id integer primary key auto_increment,
cuenta integer, calle varchar(80),
cp integer, municipio varchar(60),
foreign key(cuenta) references usuario(cuenta));

select *from usuario;
select *from direccion;

