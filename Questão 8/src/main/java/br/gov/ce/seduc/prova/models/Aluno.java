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
