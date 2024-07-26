package entities;

public class ElementoMultimediale {
    private String titolo;
    private int luminosita;
    private int volume;
    private int durata;

    public ElementoMultimediale(int luminosita, String titolo) {
        this.luminosita = luminosita;
        this.titolo = titolo;
    }

    public ElementoMultimediale(String titolo, int volume, int durata, int luminosita) {
        this.titolo = titolo;
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    public ElementoMultimediale(String titolo, int volume, int durata) {
        this.durata = durata;
        this.volume = volume;
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public int setLuminosita(int luminosita) {
        this.luminosita = luminosita;
        return luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public int setVolume(int volume) {
        this.volume = volume;
        return volume;
    }

    public int getDurata() {
        return durata;
    }
}
