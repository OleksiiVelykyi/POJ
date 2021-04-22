package poj.lab6.zad3;
import java.text.DateFormatSymbols;
public class MojaData {
    private final int dni;
    private final int months;
    private final int lata;
    public MojaData(final int dni, final int months, final int lata) {
        this.dni = dni;
        this.months = months;
        this.lata = lata;
    }
    @Override
    public String toString() {
        return "%d %s %d".formatted(this.dni,  new DateFormatSymbols().getShortMonths()[this.months - 1], this.lata);
    }
}
