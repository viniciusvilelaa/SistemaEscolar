package br.imd.SistemaEscolar.model;


import br.imd.SistemaEscolar.DTO.AlunoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="alunos")
public class AlunoEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) //Id pode ser qualquer elemento que seja unico para aquele dividuo
    long id;

    @Column(name = "nome")
    String nome;

    @Column(name = "cpf")
    String cpf;

    @Column(name = "dataNascimento")
    LocalDate dataNascimento;

    @Column(name = "Email")
    String email;

    @Column(name = "Matricula")
    Long Matricula;

    boolean ativo;


}
