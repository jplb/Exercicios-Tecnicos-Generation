select * from tb_personagem;

SELECT * FROM tb_personagem WHERE ataque >=2000;

SELECT * FROM tb_personagem WHERE ataque BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem WHERE nick LIKE "%c%";

SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe;

SELECT * FROM tb_personagem WHERE fk_classe = 4;

SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.fk_classe = 4;