package poj.lab6.zad1;

public class Main {
    public static void main(final String[] args) {
        final Firma firma = new Firma(new Pracownik[] {
           new Pracownik("Paulina", "Gełbotowska", 80),
           new Pracownik("Michał", "Dubowik", 60),
           new Pracownik("Regina", "Turska", 60),
           new Pracownik("Mikołaj", "Żukowski",100),
           new Pracownik("Krzysztof", "Glińki", 50),
        });
        System.out.printf("3dzienny Koszt: %.2f%n", firma.obliczKoszt(Time.DAY, 3));
        System.out.printf("Dzienny Koszt: %.2f%n", firma.obliczKoszt(Time.DAY));
        System.out.printf("Miesieczny Koszt: %.2f%n", firma.obliczMiesiecznyKosztFirmy());
        System.out.printf("Roczny Koszt: %.2f%n", firma.obliczRocznyKosztFirmy());
    }
    
}
