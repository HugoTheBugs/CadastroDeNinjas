-- Migrations para adicionar a coluna de RANK na tabela cadastros

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);