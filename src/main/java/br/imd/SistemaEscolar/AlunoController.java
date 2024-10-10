package br.imd.SistemaEscolar;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/aluno1")
    public String olaAluno1(){
        return "OLa Aluno1";
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

    @GetMapping("/{nome}")
    public String olaAluno4(@PathVariable String nome){
        return "ola " + nome;
    }

    @PostMapping
    public String imprimir(@RequestBody String json){
        return json;
    }



}
