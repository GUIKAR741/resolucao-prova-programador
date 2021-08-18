package br.gov.ce.seduc.prova.controllers;

import br.gov.ce.seduc.prova.models.Aluno;
import br.gov.ce.seduc.prova.repositories.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")
@AllArgsConstructor
public class Rest {
    private final AlunoRepository alunoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Aluno>> getAlunos() {
        return ResponseEntity.ok(alunoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAluno(@PathVariable int id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/matricula/{matricula}")
    public ResponseEntity<Aluno> getAluno(@PathVariable String matricula) {
        Optional<Aluno> aluno = alunoRepository.getAlunoByMatricula(matricula);
        return aluno.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
        return ResponseEntity.ok(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(@PathVariable int id, @RequestBody Aluno aluno) {
        Optional<Aluno> alunoUpdate = alunoRepository.findById(id);
        return alunoUpdate.map((value) -> ResponseEntity.ok(alunoRepository.save(aluno))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAluno(@PathVariable int id) {
        Optional<Aluno> alunoDelete = alunoRepository.findById(id);
        return alunoDelete.map((value) -> {
            alunoRepository.deleteById(id);
            return ResponseEntity.ok("Deletado");
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
