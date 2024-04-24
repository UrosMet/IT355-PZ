package com.metropolitan.it355.services;

import com.metropolitan.it355.entity.Soba;

import java.util.List;

public interface SobaService {
    /**
     * Metoda vraca sve sobe
     * @return List<Soba>
     */
    List<Soba> getAll();

    /**
     * Metoda vraca jednog sobu po ID
     * @param id
     * @return Soba
     */
    Soba getById(int id);

    /**
     * Metoda dodaje jednu sobu u bazu
     * @param soba
     * @return Soba
     */
    Soba add(Soba soba);

    /**
     * Metoda update-uje sobu u bazu
     * @param soba
     * @return Soba
     */
    Soba update(Soba soba);

    /**
     * Metoda brise sobu iz baze po ID
     * @param id
     */
    void delete(int id);
}
