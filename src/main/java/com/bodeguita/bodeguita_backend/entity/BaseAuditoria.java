package com.bodeguita.bodeguita_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseAuditoria {

    @Column(name = "usu_cre", length = 30)
    private String usuarioCreador;

    @Column(name = "pc_cre", length = 30)
    private String pcCreador;

    @Column(name = "fec_cre")
    private LocalDateTime fecCreador;

    @Column(name = "usu_mod", length = 30)
    private String usuarioModificador;

    @Column(name = "pc_mod", length = 30)
    private String pcModificador;

    @Column(name = "fec_mod")
    private LocalDateTime fecModificador;

    @Column(name = "estado")
    private Boolean estado = Boolean.TRUE;
}