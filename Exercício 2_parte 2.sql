select * from tb_produtos;

select * from tb_produtos where preço >= 500;

select * from tb_produtos where preço < 500;

update tb_produtos set qtdEstoque = 0, ativo = 0
where id_produto = 8;