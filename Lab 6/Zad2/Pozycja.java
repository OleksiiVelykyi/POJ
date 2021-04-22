package poj.lab6.zad2;
public class Pozycja {
    private final String nazwaTowaru;
    private final int ilosc;
    private final double cena;
    public Pozycja(final String nazwaTowaru, final int ilosc, final double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ilosc = ilosc;
        this.cena = cena;
    }
    public double iloscWartosc() {
        return this.ilosc * this.cena;
    }
    @Override
    public String toString() {
        return "Pozycja: %s, (%d) %.2f per item, total: %.2f".formatted(this.nazwaTowaru, this.ilosc, this.cena, this.iloscWartosc());
    }
}
