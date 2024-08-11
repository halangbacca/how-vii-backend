package com.halan.univali.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_imoveis")
public class Imovel {

    @Id
    @Column(name = "codigo_imovel")
    private String codigoImovel;

    @Column(name = "descricao_imovel")
    @NotNull
    private String descricaoImovel;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "tipo_imovel")
    private TipoImovel tipoImovel;

    public Imovel(String codigoImovel, String descricaoImovel, TipoImovel tipoImovel) {
        this.codigoImovel = codigoImovel;
        this.descricaoImovel = descricaoImovel;
        this.tipoImovel = tipoImovel;
    }

    public Imovel() {
    }

    public String getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(String codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getDescricaoImovel() {
        return descricaoImovel;
    }

    public void setDescricaoImovel(String descricaoImovel) {
        this.descricaoImovel = descricaoImovel;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

}
