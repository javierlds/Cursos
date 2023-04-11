IF NOT EXISTS (select 1 from  rol_x_usuario where id_usuario  = (select id from  usuario where numero_documento = 'japarra'))
BEGIN
	insert into rol_x_usuario(id_rol,id_usuario)
	select 1, id
	from  usuario
	where numero_documento = 'japarra';

	insert into rol_x_usuario(id_rol,id_usuario)
	select 2, id
	from  usuario
	where numero_documento = 'japarra';

	insert into rol_x_usuario(id_rol,id_usuario)
	select 3, id
	from  usuario
	where numero_documento = 'japarra';
END
GO