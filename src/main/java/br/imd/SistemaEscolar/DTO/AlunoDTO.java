package br.imd.SistemaEscolar.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;


@Getter
@Setter
public class AlunoDTO {

        @NotNull
        String nome;

        @NotBlank(message = "CPF não pode ser vazio")
        @CPF(message = "Digite um valor válido para CPF")
        String cpf;

        @NotNull
        @Past
        LocalDate dataNascimento;

        @Email(message = "Digite um valor válido para EMAIL")
        @NotBlank(message = "EMAIL não pode ser vazio")
        String email;


}