package com.api.detallesjeans.modelmicroservice.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "modelo")
public class Modelo implements Serializable {
    private static final long serialVersionUID = 1797247848178553384L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long mod_id;

    private String mod_descripcion;
    private boolean mod_estado;

}