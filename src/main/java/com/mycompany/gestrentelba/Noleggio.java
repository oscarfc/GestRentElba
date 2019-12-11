/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

import java.time.LocalDateTime;

/**
 *
 * creare classe noleggio attributi chi ? Cosa ? numGG (opzionale usare data
 * noleggio e data reso e tipo di noleggio)
 */
public class Noleggio {
    private final Mezzo mezzo;
    private final Turista turista;
    private final LocalDateTime inizioNoleggio;
    private LocalDateTime fineNoleggio;

    public Noleggio(Mezzo mezzo, Turista turista, LocalDateTime inizioNoleggio) {
        this.mezzo = mezzo;
        this.turista = turista;
        this.inizioNoleggio = inizioNoleggio;
        this.fineNoleggio = null;
    }

    public Mezzo getMezzo() {
        return mezzo;
    }

    public Turista getTurista() {
        return turista;
    }

    public LocalDateTime getInizioNoleggio() {
        return inizioNoleggio;
    }

    public LocalDateTime getFineNoleggio() {
        return fineNoleggio;
    }

    public void setFineNoleggio(LocalDateTime fineNoleggio) {
        this.fineNoleggio = fineNoleggio;
    }
}
