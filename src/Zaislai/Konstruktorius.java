package Zaislai;

public class Konstruktorius extends Zaislas{
    private int detaliuSkaicius;

    public Konstruktorius(String pavadinimas, String gamintojas, int amziausRiba, double kaina, int detaliuSkaicius) {
        super(pavadinimas, gamintojas, amziausRiba, kaina);
        this.detaliuSkaicius = detaliuSkaicius;
    }

    public int getDetaliuSkaicius() {
        return detaliuSkaicius;
    }

    public void setDetaliuSkaicius(int detaliuSkaicius) {
        this.detaliuSkaicius = detaliuSkaicius;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(",%s", this.detaliuSkaicius);
    }
}
