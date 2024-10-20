package br.imd.SistemaEscolar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="professores")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "Nome")
    String nome;
    @Column(name = "Cpf")
    String cpf;
    @Column(name = "dataNascimento")
    String dataNascimento;
}
