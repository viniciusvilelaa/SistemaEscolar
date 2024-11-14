package br.imd.SistemaEscolar.controllers;


import br.imd.SistemaEscolar.DTO.ProfessorDTO;
import br.imd.SistemaEscolar.model.ProfessorEntity;
import br.imd.SistemaEscolar.repository.ProfessorRepository;
import br.imd.SistemaEscolar.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;


    @GetMapping("teste")
    public String olaProfessor(){
        return "Ola Professor";
    }

    @Autowired
    private ProfessorService professorService;

    @PostMapping("api/criarProfessor")
    public ResponseEntity<ProfessorEntity> criarProfessor(@RequestBody @Valid ProfessorDTO professorDTO){
        ProfessorEntity novoProfessor = professorService.salvarProfessor(professorDTO);
        return ResponseEntity.ok(novoProfessor);
    }

    @GetMapping("api/getprofessor")
    public ResponseEntity<List<ProfessorEntity>> listarProfessor(){
        List<ProfessorEntity> professores = professorService.listarTodos();
        return ResponseEntity.ok(professores);
    }

    @GetMapping("web")
    public ModelAndView listarProfessores(Model model){
        List<ProfessorEntity> professores = professorService.listarTodos();
        model.addAttribute("professores", professores);
        ModelAndView mv = new ModelAndView("list-aluno");
        return mv;
    }

}
