package entities;

import interfaces.Luminosita;
import interfaces.Play;
import interfaces.Volume;

import java.util.Scanner;

public class Video extends ElementoMultimediale implements Play, Volume, Luminosita {

    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo, volume, durata, luminosita);
    }

    @Override
    public void play() {
        System.out.println("\n");
        String puntoEsclamativo = "";
        String asterisco = "";
        for (int i = 0; i < this.getVolume(); i++) {
            puntoEsclamativo += "!";
        }

        for (int i = 0; i < this.getLuminosita(); i++) {
            asterisco += "*";
        }

        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(this.getTitolo() + puntoEsclamativo + asterisco);
        }
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

    @Override
    public void riduciVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("riduci il volume");

        while (Integer.parseInt(scanner.nextLine()) > this.getVolume()) {
            System.out.println("inserisci un numero minore di: " + this.getVolume());
        }

        int nuovoValoreVolume = setVolume(Integer.parseInt(scanner.nextLine()));
        System.out.println("il volume attuale è: " + nuovoValoreVolume);
    }

    @Override
    public void aumentaVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aumenta il volume");

        while (Integer.parseInt(scanner.nextLine()) < this.getVolume()) {
            System.out.println("inserisci un numero maggiore di: " + this.getVolume());
        }

        int nuovoValoreVolume = setVolume(Integer.parseInt(scanner.nextLine()));
        System.out.println("il volume attuale è: " + nuovoValoreVolume);
    }
}
