package com.ap.prenotazioni;

public class Tavolo {

    public String getNominativo() {
        return nominativo;
    }

    private String nominativo;

    //public boolean isDisponibile () {return false;}
    public boolean isDisponibile () {return nominativo == null || nominativo.length() == 0;}
    //Quando nominativo non è nullo o nominativo.length non è zero, restituisce false (i.e.,
    // se al tavolo è associato un nominativo valido, il tavolo non è disponibile.
    public void prenotaPer(String nominativo) {
        this.nominativo = nominativo;
    }

    public void liberaTavolo() {
        nominativo = null;

    }

}
