package br.imd.SistemaEscolar.controllers;

import br.imd.SistemaEscolar.model.AlunoEntity;
import br.imd.SistemaEscolar.model.ProfessorEntity;
import br.imd.SistemaEscolar.repository.AlunoRepository;
import br.imd.SistemaEscolar.service.AlunoService;
import br.imd.SistemaEscolar.service.ProfessorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("ambos")
public class AmbosController {

    private final AlunoRepository alunoRepository;
    private final AlunoService alunoService;
    private final ProfessorService professorService;

    public AmbosController(AlunoRepository alunoRepository, AlunoService alunoService, ProfessorService professorService) {
        this.alunoRepository = alunoRepository;
        this.alunoService = alunoService;
        this.professorService = professorService;
    }

    @GetMapping("exibir")
    public ModelAndView listarAmbos(Model model){
        List<AlunoEntity> alunos = alunoService.listarTodos();
        List<ProfessorEntity> professores = professorService.listarTodos();
        model.addAttribute("professores",professores);
        model.addAttribute("alunos",alunos);
        ModelAndView mv = new ModelAndView("list-aluno");
        return mv;
    }

}
