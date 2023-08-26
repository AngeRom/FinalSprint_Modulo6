package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Profesional{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "fechaIngreso", nullable = false)
    private String fechaIngreso;




}
