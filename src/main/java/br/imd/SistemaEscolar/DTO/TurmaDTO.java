package br.imd.SistemaEscolar.DTO;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
public class TurmaDTO {
    @NotNull
    String nome;

    @NotNull
    String turno;

    @NotBlank
    Long id_professor;

}
