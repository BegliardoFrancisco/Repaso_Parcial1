package ar.edu.utn.frc.backend.Entities;


import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name= "Alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(unique=true)
    int legajo;

    @Column(unique=true)
    String documento_identidad;

    @Column(nullable = false)
    String nombre;

    @Column(nullable = false)
    String direccion;

    String telefono;

    @Column(unique=true)
    String mail;

}
