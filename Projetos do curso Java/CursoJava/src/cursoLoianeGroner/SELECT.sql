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
SELEC count(*)  --Para CONTAR tudo ou
SELECT count(DISTINCT coluna1, coluna2) -- Para CONTAR sem duplicatas. 
FROM TABELA

--TOP => É utilizado para especificar um número de registro para ser retornado
SELECT TOP 10 *
FROM TABELA

--ORDER BY
SELECT coluna1, coluna2
FROM TABELA
ORDER BY coluna1 asc/desc

--BETWEEN => É usado para encontrar valor entre um valor minimo e valor maximo.
valor BETWEEN minimo and maximo;

--IN => É usado para verificar se um valor corresponde com qualquer valor passado na lista de valores. Usamos junto com o Where.
SELEC *
FROM TABELA
WHERE coluna1 IN (*,*,*ETC);

--LIKE => É usado para encontrar algo dentro do banco de dados que você nao sabe o nome dela direito. lembra de apenas uma parte tipo ovi... alguma coisa.
SELEC
FROM TABELA
WHERE FirstName LIKE 'ovi%' --ou '%ton'
