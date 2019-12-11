/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

/**
 *
 * @author oscar.favero
 */
class SchedaNoleggio {
    private String modello;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String telefono;
    private float  costoNoleggio;

    public SchedaNoleggio(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public float getCostoNoleggio() {
        return costoNoleggio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCostoNoleggio(float costoNoleggio) {
        this.costoNoleggio = costoNoleggio;
    }
   
}