package com.ap.prenotazioni;

import static org.junit.jupiter.api.Assertions.*;

class TavoloTest {

    @org.junit.jupiter.api.Test
    void getNominativo() {
    }

    /*@org.junit.jupiter.api.Test
    void isDisponibile() {
        Tavolo tavolo1 = new Tavolo();
        assertEquals(true, tavolo1.isDisponibile());
        tavolo1.prenotaPer("Mario Rossi");
        assertEquals(false, tavolo1.isDisponibile());
    }*/

    @org.junit.jupiter.api.Test
    void tavoloNuovoDeveEssereDisponibile() {
        Tavolo tavolo1 = new Tavolo();
        assertEquals(true, tavolo1.isDisponibile());
    }

    @org.junit.jupiter.api.Test
    void tavoloPrenotatoNonDeveEssereDisponibile() {
        Tavolo tavolo1 = new Tavolo();
        tavolo1.prenotaPer("Mario Rossi");
        assertEquals(false, tavolo1.isDisponibile());
    }

    @org.junit.jupiter.api.Test
    void tavoloPrenotatoELiberatoDeveEssereDisponibile() {
        Tavolo tavolo1 = new Tavolo();
        tavolo1.prenotaPer("Mario Rossi");
        tavolo1.liberaTavolo();
        assertEquals(true, tavolo1.isDisponibile());
    }


    @org.junit.jupiter.api.Test
    void prenotaPer() {
    }
}