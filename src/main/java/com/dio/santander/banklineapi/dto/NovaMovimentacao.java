package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.TipoMovimetacao;

public class NovaMovimentacao {

    private String descricao;
    private Double valor;
    private TipoMovimetacao tipo;
    private Integer idConta;

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