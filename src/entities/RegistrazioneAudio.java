package entities;

import interfaces.Play;
import interfaces.Volume;

import java.util.Scanner;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume {
    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo, volume, durata);
    }

    @Override
    public void play() {
        System.out.println("\n");
        String puntoEsclamativo = "";
        for (int i = 0; i < this.getVolume(); i++) {
            puntoEsclamativo += "!";
        }
        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(this.getTitolo() + puntoEsclamativo);
        }
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
