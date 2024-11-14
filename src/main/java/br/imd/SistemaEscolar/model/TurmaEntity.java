package br.imd.SistemaEscolar.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Turmas")
public class TurmaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "Disciplina")
    String nome;

    @Column(name = "Turno")
    @Enumerated(EnumType.STRING)
    Turno turno;

    public enum Turno {
        MASCULINO, FEMININO
    }

    @Column(name = "Docente")
    Long docente;

}
