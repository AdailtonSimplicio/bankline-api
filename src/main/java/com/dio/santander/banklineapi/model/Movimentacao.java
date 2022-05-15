package com.dio.santander.banklineapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd:mm:ss")
    private LocalDateTime dataHora;
    private String descricao;
    private Double valor;
    @Enumerated(EnumType.STRING)
    private TipoMovimetacao tipo;
    @Column(name = "id_conta")
    private Integer idConta;

    //Gets e Sets

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoMovimetacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimetacao tipo) {
        this.tipo = tipo;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }
}
