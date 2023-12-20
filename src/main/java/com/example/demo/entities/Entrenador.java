package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Entrenador {

    @Id
    Integer id;
    String nombre;
    String apellido;
    Date fechaNacimiento;
    Date fechaVinculacion;
    Integer puebloId;
    String uuid;


}
