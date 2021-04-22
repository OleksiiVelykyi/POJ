package poj.lab6.zad5;
import java.util.Objects;
public abstract class Samochod {
    protected int predkosc;
    protected int limitPredkosci;
    private final String kolor;
    private final String marka;
    private final int rocznik;

    public Samochod(int limitPredkosci, String kolor, String marka, int rocznik) {
        this.limitPredkosci = limitPredkosci;
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "predkosc=" + predkosc +
                ", limitPredkosci=" + limitPredkosci +
                ", kolor='" + kolor + '\'' +
                ", marka='" + marka + '\'' +
                ", rocznik=" + rocznik +
                '}';
    }
    @Override
    public boolean equals(final Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Samochod samochod = (Samochod) o;

        if (rocznik != samochod.rocznik) return false;
        if (!kolor.equals(samochod.kolor)) return false;
        return marka.equals(samochod.marka);
    }
    @Override
    public int hashCode() {
        return Objects.hash(predkosc, limitPredkosci, kolor, marka, rocznik);
    }

    public abstract void accelerate();

}
