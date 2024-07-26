import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio registrazioneAudio1 = new RegistrazioneAudio("audio1", 5, 1);
        registrazioneAudio1.play();

        Video video1 = new Video("video1", 3, 5, 9);
        video1.play();

        Immagine immagine1 = new Immagine(5, "immagine1");
        immagine1.show();

        ElementoMultimediale[] arrayEM = new ElementoMultimediale[5];
        AggiungiArrayEM(arrayEM);

    }


    public static void AggiungiArrayEM(ElementoMultimediale[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("seleziona il file");
            System.out.println("1 Immagine \n2 Audio \n3 Video");
            int scegliFile = Integer.parseInt(scanner.nextLine());

            switch (scegliFile) {

                case 1:
                    System.out.println("seleziona un titolo: ");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("scegli la luminosità: ");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    array[i] = new Immagine(luminositaImmagine, titoloImmagine);
                    break;

                case 2:
                    System.out.println("seleziona un titolo: ");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("scegli la durata: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("scegli il volume: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    array[i] = new RegistrazioneAudio(titoloAudio, volumeAudio, durataAudio);
                    break;

                case 3:
                    System.out.println("seleziona un titolo: ");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("scegli la durata: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("scegli il volume: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("scegli la luminosità: ");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    array[i] = new Video(titoloVideo, volumeVideo, durataVideo, luminositaVideo);
                    break;

                default:
                    System.out.println("ERRORE!, inserire valore da 1 a 3");
                    i--;
                    break;
            }
        }
    }
}
