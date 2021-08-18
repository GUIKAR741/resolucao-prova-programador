
# Questão 1

> Desenhe um schema de banco de dados com tabelas que atendam aos requisitos descritos abaixo; poderá ser utilizado diagramas, texto ou qualquer outra forma de representação de schema de banco de dados, contanto que sejam apontados todos os relacionamentos e os tipos de dados:

Deseja-se guardar os seguintes dados:

- alunos (id, matricula, nome, sexo, idade e endereco)
- professores (id, nome, cpf)
- disciplinas (id, nome)
- turma (id, nome, turno).

Modele de uma forma que obedeça as seguintes regras:

1. Um aluno poderá se matricular em N turmas.
2. Um professor poderá dar aula em N turmas e N disciplinas.
3. Uma turma só poderá ter 1 professor por disciplina (Não é permitido ter 2
professores dando aula na mesma turma com a mesma disciplina)
4. Uma turma poderá ter aula de várias disciplinas. (Ex: turma 1º A poderá ter aulas
de Português, Matemática, etc.)

1 - Um aluno pode ter varias turmas e uma turma pode ter varios alunos

aluno n x m turmas

2, 3 e 4 - Uma turma pode ter varias disciplinas e uma disciplina pode ter um professor mas ele pode ensinar em varias disciplinas

turma n x n disciplina

disciplina n x 1 professor

![Questão 1 - Diagrama](questao1.png)
