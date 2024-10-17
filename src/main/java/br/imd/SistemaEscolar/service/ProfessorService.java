package br.imd.SistemaEscolar.service;


import br.imd.SistemaEscolar.DTO.ProfessorDTO;
import br.imd.SistemaEscolar.model.ProfessorEntity;
import br.imd.SistemaEscolar.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    //Metodo para converter DTO e salvar o professor na table
    public ProfessorEntity salvarProfessor(ProfessorDTO professorDTO){
        ProfessorEntity professor = new ProfessorEntity();
        professor.setNome(professorDTO.getNome());
        professor.setCpf(professorDTO.getCpf());
        professor.setDataNascimento(professor.getDataNascimento());
        return  professorRepository.save(professor);
    }

    public List<ProfessorEntity> listarTodos(){
        return professorRepository.findAll();
    }

}
