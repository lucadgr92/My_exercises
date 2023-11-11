package com.ap.prenotazioni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrenotazioniBarTest {

    @Test
    void tuttiTavoliLiberiAllaPartenza() {
        PrenotazioniBar prenotazioniApp = new PrenotazioniBar(3);
        assertEquals(3, prenotazioniApp.getTavoliLiberi());
    }

    @Test
    void aggiuntaPrenotazioneDecrementaTavoliLiberi() {
        PrenotazioniBar prenotazioniApp = new PrenotazioniBar(3);
        int tavoliLiberi = prenotazioniApp.getTavoliLiberi();
        try {
            prenotazioniApp.prenota("Mario Rossi");
            assertEquals(1, tavoliLiberi - prenotazioniApp.getTavoliLiberi());
        } catch (NessunTavoloDisponibileException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

}