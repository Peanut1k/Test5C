package Ukol2;

public class Hrac {
    private String jmeno;
    private String pozice;
    private int goly;

    Hrac (String jmeno, String pozice, int goly) {
        this.jmeno = jmeno;
        this.pozice = pozice;
        this.goly = goly;
    }


    @Override
    public String toString() {
        return jmeno + " Pozice: " + pozice + " Pocet golu: " + goly;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPozice() {
        return pozice;
    }

    public int getGoly() {
        return goly;
    }
}
