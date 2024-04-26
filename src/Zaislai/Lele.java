package Zaislai;

import Enmus.Sukuosena;

public class Lele extends Zaislas{
    private Sukuosena sukuosena;

    public Lele(String pavadinimas, String gamintojas, int amziausRiba, double kaina, Sukuosena sukuosena) {
        super(pavadinimas, gamintojas, amziausRiba, kaina);
        this.sukuosena = sukuosena;
    }

    public Sukuosena getSukuosena() {
        return sukuosena;
    }

    public void setSukuosena(Sukuosena sukuosena) {
        this.sukuosena = sukuosena;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(",%s", this.sukuosena);
    }
}
