SELECT * FROM tb_pizza;

SELECT * FROM tb_pizza INNER JOIN tb_categoria WHERE preco > 45;

SELECT * FROM tb_pizza INNER JOIN tb_categoria WHERE preco BETWEEN 29 AND 60;

SELECT * FROM tb_pizza INNER JOIN tb_categoria WHERE nome LIKE "%c%";

SELECT * FROM tb_pizza INNER JOIN tb_categoria;

SELECT * FROM tb_pizza INNER JOIN tb_categoria WHERE sabor = "doce";