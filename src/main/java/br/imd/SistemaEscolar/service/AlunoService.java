package br.imd.SistemaEscolar.service;

import br.imd.SistemaEscolar.DTO.AlunoDTO;
import br.imd.SistemaEscolar.model.AlunoEntity;
import br.imd.SistemaEscolar.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    //Metodo para converter o DTO e salvar o produto
    public AlunoEntity salvarAluno(AlunoDTO alunoDTO){
        AlunoEntity aluno = new AlunoEntity();
        aluno.setNome(alunoDTO.getNome());
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setDataNascimento(alunoDTO.getDataNascimento());
        return alunoRepository.save(aluno);
    }

    public List<AlunoEntity> listarTodos(){
        List<AlunoEntity> alunos = alunoRepository.findAll();


        return alunoRepository.findAll();
    }




}
