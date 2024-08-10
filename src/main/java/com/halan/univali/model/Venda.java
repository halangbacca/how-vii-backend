package com.halan.univali.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_vendas")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Long id;

    @Column(name = "data_pagamento")
    @NotNull
    private LocalDate dataPagamento;

    @Column(name = "valorPagamento")
    @NotNull
    private BigDecimal valorPagamento;

    @ManyToOne
    @JoinColumn(name = "codigo_imovel")
    private Imovel imovel;

    public Venda(Long id, LocalDate dataPagamento, BigDecimal valorPagamento, Imovel imovel) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
        this.imovel = imovel;
    }

    public Venda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(BigDecimal valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
}
