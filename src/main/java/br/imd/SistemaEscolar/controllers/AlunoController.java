package br.imd.SistemaEscolar.controllers;


import br.imd.SistemaEscolar.DTO.AlunoDTO;
import br.imd.SistemaEscolar.model.AlunoEntity;
import br.imd.SistemaEscolar.repository.AlunoRepository;
import br.imd.SistemaEscolar.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/aluno1")
    public String olaAluno1(){
        return "aluno1";
    }

    @GetMapping("/aluno2")
    public String olaAluno2(){
        return "OLa Aluno2";
    }

    @GetMapping("/aluno3")
    public ModelAndView olaAluno3(){
        ModelAndView mv = new ModelAndView("index");
        return mv;

    }

    /*@GetMapping("/{nome}")
    public String olaAluno4(@PathVariable String nome){
        return "ola " + nome;
    }*/

    @PostMapping("json")
    public String imprimir(@RequestBody String json){
        return json;
    }

    /*@PostMapping("dto")
    public void imprimirDadosJson(@RequestBody AlunoDTO alunoDTO){
        System.out.println("Nome aluno:" + alunoDTO.nome());
        System.out.println("Cpf aluno:" + alunoDTO.cpf());
        System.out.println("Data Nascimento:" + alunoDTO.dataNascimento());

    }*/

    @Autowired
    private AlunoService alunoService;

    @PostMapping("api/aluno")
    public ResponseEntity<AlunoEntity> criarAluno(@RequestBody AlunoDTO alunoDTO){
        AlunoEntity novoAluno = alunoService.salvarAluno(alunoDTO);
        return ResponseEntity.ok(novoAluno);
    }

    @GetMapping("api/getAlunos")
    public ResponseEntity<List<AlunoEntity>> listarAlunos(){
        List<AlunoEntity> alunos = alunoService.listarTodos();
        return ResponseEntity.ok(alunos);

    }

    @GetMapping("web")
    public ModelAndView listarAlunos(Model model) {
        List<AlunoEntity> alunos = alunoService.listarTodos();
        model.addAttribute("alunos", alunos);
        ModelAndView teste = new ModelAndView("list-aluno");
        return teste;
    }

}
