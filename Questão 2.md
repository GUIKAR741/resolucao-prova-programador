# Questão 2

> Com base no schema criado na questão anterior, crie as seguintes consultas em linguagem SQL:

a. Listar quantidade de alunos com mesmo nome.

```sql
SELECT nome, count(nome) FROM aluno GROUP BY nome;
```

b. Listar as turmas cujo aluno “José” está matriculado com o professor “Armando”.

```sql
SELECT turma.nome 
FROM turma
INNER JOIN aluno_turma
ON turma.id == aluno_turma.turma_id
INNER JOIN aluno
ON aluno.id == aluno_turma.aluno_id
INNER JOIN turma_disciplina
ON turma.id == turma_disciplina.turma_id
INNER JOIN disciplina
ON disciplina.id == aluno_turma.disciplina_id
INNER JOIN professor
ON professor.id == disciplina.professor_id
WHERE aluno.nome = "José" and professor.nome = "Armando"
```

c. Listar alunos(as) do sexo feminino que não estão em turmas da disciplina "Artes".

```sql
SELECT aluno.nome
FROM aluno
INNER JOIN aluno_turma
ON aluno.id == aluno_turma.aluno_id
INNER JOIN turma
ON turma.id == aluno_turma.turma_id
INNER JOIN turma_disciplina
ON turma.id == turma_disciplina.turma_id
INNER JOIN disciplina
ON disciplina.id == aluno_turma.disciplina_id
WHERE aluno.sexo = 'F' and disciplina.nome<>"Artes";
```

d. Listar os alunos da disciplina de “Matemática” com nome em ordem alfabética.

```sql
SELECT aluno.nome
FROM aluno
INNER JOIN aluno_turma
ON aluno.id == aluno_turma.aluno_id
INNER JOIN turma
ON turma.id == aluno_turma.turma_id
INNER JOIN turma_disciplina
ON turma.id == turma_disciplina.turma_id
INNER JOIN disciplina
ON disciplina.id == aluno_turma.disciplina_id
WHERE disciplina.nome="Matématica"
ORDER BY aluno.nome ASC;
```
