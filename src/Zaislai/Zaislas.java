package Zaislai;

public class Zaislas {
    private String pavadinimas, gamintojas;
    private int amziausRiba;
    private double kaina;

    public Zaislas(String pavadinimas, String gamintojas, int amziausRiba, double kaina) {
        this.pavadinimas = pavadinimas;
        this.gamintojas = gamintojas;
        this.amziausRiba = amziausRiba;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public int getAmziausRiba() {
        return amziausRiba;
    }

    public void setAmziausRiba(int amziausRiba) {
        this.amziausRiba = amziausRiba;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString() {
        return String.format("Pavadinimas %s, Gamintojas %s, Kaina: %s, Amziaus riba: %s", this.pavadinimas, this.gamintojas, this.kaina, this.amziausRiba );
    }
}

























