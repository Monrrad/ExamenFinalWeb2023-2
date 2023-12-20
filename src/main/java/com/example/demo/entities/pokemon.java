package com.example.demo.entities;

import lombok.Data;

import java.util.Date;

@Data
public class pokemon {

    Integer id;
    String nombre;
    String descripcion;
    Integer tipoPokemon;
    Date fechaDescubrimiento;
    Integer generacion;
    String uuid;


}
