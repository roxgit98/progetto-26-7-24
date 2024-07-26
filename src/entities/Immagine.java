package entities;

import interfaces.Luminosita;

import java.util.Scanner;

public class Immagine extends ElementoMultimediale implements Luminosita {

    public Immagine(int luminosita, String titolo) {
        super(luminosita, titolo);
    }

    public void mostraAsterisco() {
        String asterisco = "";
        for (int i = 0; i < this.getLuminosita(); i++) {
            asterisco += "*";
        }
        System.out.println(this.getTitolo() + asterisco);
    }

    @Override
    public void riduciLuminosita() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("riduci la luminosità");

        while (Integer.parseInt(scanner.nextLine()) > this.getLuminosita()) {
            System.out.println("inserisci un valore minore di: " + this.getLuminosita());
        }

        int nuovoValoreLuminosita = setLuminosita(Integer.parseInt(scanner.nextLine()));
        System.out.println("la luminosità attuale è: " + nuovoValoreLuminosita);
    }

    @Override
    public void aumentraLuminosita() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aumenta la luminosità");

        while (Integer.parseInt(scanner.nextLine()) < this.getLuminosita()) {
            System.out.println("inserisci un valore maggiore di: " + this.getLuminosita());
        }

        int nuovoValoreLuminosita = setLuminosita(Integer.parseInt(scanner.nextLine()));
        System.out.println("la luminosità attuale è: " + nuovoValoreLuminosita);
    }
}
