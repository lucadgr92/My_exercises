package com.ap.prenotazioni;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PrenotazioniBar {

    private final ArrayList<Tavolo> tavoli;


    public PrenotazioniBar(int nTavoli) {
        tavoli = new ArrayList<>();
        setNumberoTavoli(nTavoli);
    }

    public void setNumberoTavoli(int nTavoli) {
        tavoli.clear();
        for (int i = 0; i < nTavoli; i++) {
            tavoli.add(new Tavolo());
        }
    }


    public static void main (String[] args) {
        PrenotazioniBar prenotazioni = new PrenotazioniBar(10);
        prenotazioni.run();
    }

    private void run() {

        int scelta = -1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Gestione prenotazioni.");
            System.out.println("Tavoli liberi: " + getTavoliLiberi());
            System.out.println("1 - Prenota");
            System.out.println("2 - Libera");
            System.out.println("0 - Esci");

            System.out.println();
            System.out.println("> ");

            scelta = sc.nextInt();

            switch (scelta) {
                case 1: prenotaTavolo(); break;
                case 2: liberaTavolo(); break;
                case 0: return;
            }

        } while (scelta != 0);
        
    }

    private void prenotaTavolo() {
        Scanner sc = new Scanner(System.in);
        String nominativo = sc.nextLine();
        for(int i = 0; i < tavoli.size(); i++) {
            if(tavoli.get(i).isDisponibile()) {
                tavoli.get(i).prenotaPer(nominativo);
                return;
            }
        }
    }

    private void liberaTavolo() {
        Scanner sc = new Scanner(System.in);
        String nominativo = sc.nextLine();
        try {
            prenota(nominativo);
        } catch (NessunTavoloDisponibileException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        return;
    }

    public int getTavoliLiberi() {
        int tavoliLiberi = 0;
        for (int i = 0; i < tavoli.size(); i++) {
            if(tavoli.get(i).isDisponibile()) {
                tavoliLiberi++;
            }
        }
        return tavoliLiberi;
    }

    public void prenota(String nomePrenotazione) throws NessunTavoloDisponibileException {
        if(getTavoliLiberi() == 0) {
            throw new NessunTavoloDisponibileException();
        } else {
            for(int i = 0; i < tavoli.size(); i++) {
                if(tavoli.get(i).isDisponibile()) {
                    tavoli.get(i).prenotaPer(nomePrenotazione);
                    return;
                }
            }
        }
    }
}
