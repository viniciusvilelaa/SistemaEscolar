package br.imd.SistemaEscolar.service;

import br.imd.SistemaEscolar.DTO.TurmaDTO;
import br.imd.SistemaEscolar.model.AlunoEntity;
import br.imd.SistemaEscolar.model.TurmaEntity;
import br.imd.SistemaEscolar.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository turmaRepository;

    public TurmaEntity salvarTurma(TurmaDTO turmaDTO) {
        TurmaEntity turma = new TurmaEntity();
        turma.setNome(turmaDTO.getNome());
        turma.setTurno(turmaDTO.getTurno());
        turma.setId_Professor(turmaDTO.getId_professor());
        return turmaRepository.save(turma);

    }

    public List<TurmaEntity> getAll (){
        List<TurmaEntity> turmas = turmaRepository.findAll();

        return turmas;
    }


}
