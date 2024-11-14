package br.imd.SistemaEscolar.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Getter
@Setter
public class ProfessorDTO {
        @NotNull
        String nome;

        @NotBlank(message = "CPF Não pode ser vazio")
        @CPF(message = "Informe um valor válido para CPF")        
        String cpf;
        
        @NotNull
        @Past
        LocalDate dataNascimento;

}
