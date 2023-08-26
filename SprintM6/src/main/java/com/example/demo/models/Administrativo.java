package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Administrativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "area", nullable = false)
    private String area;
    @Column(name = "expPrevia", nullable = false)
    private String expPrevia;



}
