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

    public ElementoMultimediale(String titolo, int luminosita, int volume, int durata) {
        this.titolo = titolo;
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;
    }

    public ElementoMultimediale(int durata, int volume, String titolo) {
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

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }
}
