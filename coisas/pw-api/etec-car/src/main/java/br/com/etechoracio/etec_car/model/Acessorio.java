package br.com.etechoracio.etec_car.model;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ACESSORIO")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACESSORIO" )
    private Long id;

    @Column(name = "TX_DESCRICAO")
    private String descricao;
}
