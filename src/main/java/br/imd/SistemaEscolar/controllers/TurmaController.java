package br.imd.SistemaEscolar.controllers;

import br.imd.SistemaEscolar.DTO.TurmaDTO;
import br.imd.SistemaEscolar.model.AlunoEntity;
import br.imd.SistemaEscolar.model.TurmaEntity;
import br.imd.SistemaEscolar.repository.TurmaRepository;
import br.imd.SistemaEscolar.service.TurmaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("turma")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private TurmaService turmaService;

    @PostMapping("criarTurma")
    public ResponseEntity<TurmaEntity> criarTurma(@RequestBody @Valid TurmaDTO turmaDTO){
        TurmaEntity novaTurma = turmaService.salvarTurma(turmaDTO);
        return ResponseEntity.ok(novaTurma);
    }

    @GetMapping("getTurma")
    public ResponseEntity<List<TurmaEntity>> listarTurma(){
        List<TurmaEntity> turmas = turmaService.getAll();

        return ResponseEntity.ok(turmas);
    }

}
