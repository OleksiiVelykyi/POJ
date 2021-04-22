package poj.lab6

public class Main {
    public static void main(final String[] args) {
        final Firma firma = new Firma(new Pracownik[] {
           new Pracownik("Paulina", "Gełbotowska", 60),
           new Pracownik("Michał", "Dubowik", 60),
           new Pracownik("Regina", "Turska", 120),
           new Pracownik("Alex", "Derski", 80),
           new Pracownik("Mikołaj", "Żukowski",80),
           new Pracownik("Krzysztof", "Glińki", 60),
        });
        System.out.printf("3 day cost: %.2f%n", firma.ObliczKoszt(Czas.DAY, 3));
        System.out.printf("Daily cost: %.2f%n", firma.obliczKoszt(Czas.DAY));
        System.out.printf("Monthly cost: %.2f%n", firma.obliczMiesiecznyKosztFirmy());
        System.out.printf("Yearly cost: %.2f%n", firma.obliczRocznyKosztFirmy());
    }
    
}
