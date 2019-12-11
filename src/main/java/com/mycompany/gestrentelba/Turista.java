/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

/**
 * creare classe turista usr pwd nome cognome annonascita tel
 *
 * @author tss
 */
public class Turista {

    private String usr;
    private String password;
    private String nome;
    private String cognome;
    private String indirizzo;
    private int annoNascita;
    private String telefono;

    public Turista(String usr, String password, String nome, String cognome, String indirizzo, int annoNascita, String telefono) {
        this.usr = usr;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.annoNascita = annoNascita;
        this.telefono = telefono;
    }

    public String getUsr() {
        return usr;
    }

    public String getPassword() {
        return password;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public String getTelefono() {
        return telefono;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}