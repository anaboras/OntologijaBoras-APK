package ffos.p3.ontologijaboras;

import java.io.Serializable;

public class Ontologija implements Serializable {

    public Ontologija(int sifra, String autor, String dobioNagradu, int rodjenje, int vrijemeObjavljivanjaKnjige, String nagradjenaKnjiga, String zanr) {
        this.sifra = sifra;
        this.autor = autor;
        this.dobioNagradu = dobioNagradu;
        this.rodjenje = rodjenje;
        this.vrijemeObjavljivanjaKnjige = vrijemeObjavljivanjaKnjige;
        this.nagradjenaKnjiga = nagradjenaKnjiga;
        this.zanr = zanr;
    }

    private int sifra;
    private String autor;
    private String dobioNagradu;
    private int rodjenje;
    private int vrijemeObjavljivanjaKnjige;
    private String nagradjenaKnjiga;
    private String zanr;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDobioNagradu() {
        return dobioNagradu;
    }

    public void setDobioNagradu(String dobioNagradu) {
        this.dobioNagradu = dobioNagradu;
    }

    public int getRodjenje() {
        return rodjenje;
    }

    public void setRodjenje(int rodjenje) {
        this.rodjenje = rodjenje;
    }

    public int getVrijemeObjavljivanjaKnjige() {
        return vrijemeObjavljivanjaKnjige;
    }

    public void setVrijemeObjavljivanjaKnjige(int vrijemeObjavljivanjaKnjige) {
        this.vrijemeObjavljivanjaKnjige = vrijemeObjavljivanjaKnjige;
    }

    public String getNagradjenaKnjiga() {
        return nagradjenaKnjiga;
    }

    public void setNagradjenaKnjiga(String nagradjenaKnjiga) {
        this.nagradjenaKnjiga = nagradjenaKnjiga;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }
}
