package com.metropolitan.it355.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transport")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Transporta", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_Gosta")
    private Gost idGosta;

    @Column(name = "Vrsta_Transporta", length = 50)
    private String vrstaTransporta;

    @Column(name = "Vreme_Narucivanja", updatable = false)
    @CreationTimestamp
    private Instant vremeNarucivanja;

}