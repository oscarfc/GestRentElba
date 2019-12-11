/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

/**
 *
 * creare classe mezzo attributi modello prezzo giornaliero prezzo orario metodi
 * get set costruttore e schedainfo metodo costonoleggioGG in giorni
 *
 * @author tss
 */
public class Mezzo {

    private String modello;
    private float prezzoDay;
    private float prezzoOra;

    /**
     * Costruttore
     *
     * @param modello
     * @param prezzoOra il prezzo giornaliero corripsonde al (prezzoOra * 20)
     * per incentivare la tariffa giornaliera
     */
    public Mezzo(String modello, float prezzoOra) {
        this.modello = modello;
        this.prezzoOra = prezzoOra;
        this.prezzoDay = prezzoOra * 20;
    }

    public String getModello() {
        return modello;
    }

    public float getPrezzoDay() {
        return prezzoDay;
    }

    public float getPrezzoOra() {
        return prezzoOra;
    }

}
