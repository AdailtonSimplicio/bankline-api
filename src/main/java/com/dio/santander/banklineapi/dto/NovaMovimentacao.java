package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.TipoMovimetacao;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class NovaMovimentacao {

    private String descricao;
    private Double valor;
    private TipoMovimetacao tipo;
    private Integer id_conta;

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

    public Integer getId_conta() {
        return id_conta;
    }

    public void setId_conta(Integer id_conta) {
        this.id_conta = id_conta;
    }
}
