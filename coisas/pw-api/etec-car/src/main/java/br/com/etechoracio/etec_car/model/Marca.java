package br.com.etechoracio.etec_car.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MARCA")
public class Marca {
    // Definir que o mapeamento é da chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) // configurando o identity
    @Column(name = "ID_MARCA")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;
}
