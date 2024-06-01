--sintaxe SELECT // extrair dados de uma tabela.
SELECT
-- sql server, postgres, oracle, mysql

SELECT coluna1, coluna2
FROM tabela

SELECT *
FROM tabela

--//sintaxe DISTINCT // diferença é que não retorna dados duplicados.
SELECT DISTINCT coluna1, coluna2
FROM tabela

--WHERE
SELECT coluna1, coluna2, coluna n 
FROM tabela
WHERE condição;
/*
OPERADOR          -          DESCRIÇÃO
=                            IGUAL
>                            MAIOR QUE
<                            MENOR QUE
<=                           MENOR OU IGUAL
>=                           MAIOR OU IGUAL
<>                           DIFERENTE
AND                          OPERADOR LÓGICO E
OR                           OPERADOR LÓGICO OU 
*/

--COUNT => É utilizado para contar o número de registros em  uma tabela.
SELEC COUNT(*)  --Para CONTAR tudo ou
SELECT COUNT(DISTINCT coluna1, coluna2) -- Para CONTAR sem duplicatas. 
FROM TABELA

--TOP => É utilizado para especificar um número de registro para ser retornado
SELECT TOP 10 *
FROM TABELA

--ORDER BY
SELECT coluna1, coluna2
FROM TABELA
ORDER BY coluna1 asc/desc
