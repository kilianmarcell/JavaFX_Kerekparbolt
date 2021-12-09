package sample;

import java.util.Date;

public class Kerekpar {
    private int cikkszam, ar, kategoria;
    private String nev, tipus;
    private boolean hasznaltE;
    private Date rogzitesDatuma;

    public Kerekpar(int cikkszam, int ar, int kategoria, String nev, String tipus, boolean hasznaltE, Date rogzitesDatuma) {
        this.cikkszam = cikkszam;
        this.ar = ar;
        this.kategoria = kategoria;
        this.nev = nev;
        this.tipus = tipus;
        this.hasznaltE = hasznaltE;
        this.rogzitesDatuma = rogzitesDatuma;
    }

    public String getKategoriaSzoveg() {
        String kategoriaSzoveg = "";
        switch (kategoria) {
            case 1:
                kategoriaSzoveg = "férfi";
                break;
            case 2:
                kategoriaSzoveg = "női";
                break;
            case 3:
                kategoriaSzoveg = "gyermek";
                break;
        }
        return kategoriaSzoveg;
    }
}
