# Questão 8

> Implemente o que se pede abaixo:

a. Criar a classe com mapeamento JPA para a entidade Aluno.

```java
package br.gov.ce.seduc.prova.models;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private int id;

    @Getter
    @Setter
    @Column(unique = true, nullable = false)
    private String matricula;

    @Getter
    @Setter
    @Column(nullable = false)
    private String nome;

    @Getter
    @Setter
    private String cidadeNatal;

    @Getter
    @Setter
    @Column(nullable = false)
    private char sexo;

    @Getter
    @Setter
    @Column(nullable = false)
    private int idade;
}
```

b. Criar classe que vai acessar a base e executar as operações com a entidade Aluno, pode ser utilizado Spring Data Repositories, EntityManagers, JDBC, etc.

```java
package br.gov.ce.seduc.prova.repositories;

import br.gov.ce.seduc.prova.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    Optional<Aluno> getAlunoByMatricula(String matricula);
}

```

c. Implementar um serviço REST utilizando SpringBoot para a entidade Aluno (matricula, nome, sexo, idade e cidadeNatal), o serviço deverá conter as operações CRUD (salvar, atualizar, deletar, listar todos e buscar aluno por matrícula). O Serviço deverá utilizar a classe criada no item “b” para fazer as operações na base.

> Está na Pasta Questão 8
