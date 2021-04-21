select * from tb_funcionaries;

select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario < 2000;

update tb_funcionaries set cargo = "Gerente de TI", salario = 30000
where id_funcionarie = 5;