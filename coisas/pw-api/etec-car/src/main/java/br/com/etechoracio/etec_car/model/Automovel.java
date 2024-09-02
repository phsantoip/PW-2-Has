package br.com.etechoracio.etec_car.model;

import br.com.etechoracio.etec_car.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_AUTOMOVEL")

public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "ID_AUTOMOVEL")
    private Long id;

    @Column(name = "NR_ANO_FABRICACAO")
    private Integer ano_fabri;

    @Column(name = "NR_ANO_MODELO")
    private Integer ano_model;

    @Column(name = "TP_COMBUSTIVEL")
    @Enumerated(EnumType.STRING)
    private TipoCombustivelEnum tipoCombustivel;

    @Column(name = "NR_PRECO")
    private Double preco;

    @Column(name = "NR_KM_ATUAL")
    private Integer km_atual;

    @OneToOne
    @JoinColumn(name = "ID_MODELO")
    private Modelo modelo;
    @ManyToMany
    @JoinTable(name = "TBL_REL_AUTOMOVEL_ACESSORIO",
        joinColumns = @JoinColumn(name = "ID_AUTOMOVEL"),
        inverseJoinColumns =  @JoinColumn(name = "ID_ACESSORIO")

    )
    private List<Acessorio> acessorios;




}