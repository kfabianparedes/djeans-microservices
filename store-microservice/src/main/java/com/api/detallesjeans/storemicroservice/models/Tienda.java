package com.api.detallesjeans.storemicroservice.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tienda")
public class Tienda implements Serializable {

    private static final long serialVersionUID = -7758106889346815300L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long tie_id;
    private String tie_descripcion;
    private boolean tie_estado;
}