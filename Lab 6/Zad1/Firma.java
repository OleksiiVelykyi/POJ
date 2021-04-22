package poj.lab6;

public class Firma {
    private final Pracownik[] pracowniki;
    public Firma(final Pracownik[] pracowniki) {
        this.pracowniki = pracowniki;
    }
    public double obliczMiesiecznyKosztFirmy() {
        int hoursInMonth = 30 * 8;
        return this.obliczKoszt(hoursInMonth);
    }
    public double obliczRocznyKosztFirmy() {
        int hoursInYear = 12 * 30 * 8;
        return this.obliczKoszt(hoursInYear);
    }
    public double obliczKoszt(final Time period) {
        return this.obliczKoszt(period.getHours());
    }
    public double obliczKoszt(final Time period, final int times) {
        return this.obliczKoszt(period.getHours() * times);
    }
    private double obliczPracownikKoszt(final Pracownik pracownik, final int hours) {
        return pracownik.getSalary() * hours;
    }
    private double obliczKosztFirmy(final int hours) {
        double koszt = 0;
        for (Pracownik pracownik : this.pracowniki) {
            cost += this.obliczPracownikKoszt(pracownik, hours);
        }

        return koszt;
    }
}
