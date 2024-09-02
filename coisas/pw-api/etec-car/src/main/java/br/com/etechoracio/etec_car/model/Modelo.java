package br.com.etechoracio.etec_car.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MODELO")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "ID_MODELO")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "NR_POTENCIA", columnDefinition = "numeric")
    private Double potencia;

    @ManyToOne
    @JoinColumn(name = "ID_MARCA")

    private Marca marca;
}
