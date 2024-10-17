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
@Table(name="alunos")
public class AlunoEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) //Id pode ser qualquer elemento que seja unico para aquele dividuo

    long id;
    @Column(name = "nome")
    String nome;
    @Column(name = "cpf")
    String cpf;
    @Column(name = "nascimento")
    String dataNascimento;
}
