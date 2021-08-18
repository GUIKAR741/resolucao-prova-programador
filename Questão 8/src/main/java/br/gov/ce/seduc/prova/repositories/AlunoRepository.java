package br.gov.ce.seduc.prova.repositories;

import br.gov.ce.seduc.prova.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    Optional<Aluno> getAlunoByMatricula(String matricula);
}
