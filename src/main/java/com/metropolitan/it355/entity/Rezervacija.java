package com.metropolitan.it355.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rezervacija")
public class Rezervacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Rezervacije", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_Gosta")
    private Gost idGosta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_Sobe")
    private Soba idSobe;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ID_Recepcioner", nullable = false)
    private Recepcioner idRecepcioner;

    @Column(name = "Datum_Rezervacije")
    private LocalDate datumRezervacije;

    @Column(name = "Duzina_Boravka")
    private int duzinaBoravka;


}