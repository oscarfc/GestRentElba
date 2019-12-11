/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

/**
 *
 * @author tss
 */
public class Motocicletta extends Mezzo {

    float costoAssicurazioneGiornaliero;

    public Motocicletta(String modello, float prezzoOra, float costoAssicurazioneGiornaliero) {
        super(modello, prezzoOra);
        this.costoAssicurazioneGiornaliero = costoAssicurazioneGiornaliero;
    }

    public float getCostoAssicurazioneGiornaliero() {
        return costoAssicurazioneGiornaliero;
    }

}
