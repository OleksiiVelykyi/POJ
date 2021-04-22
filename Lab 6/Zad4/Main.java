package poj.lab6.zad4;
public class Main {
    public static void main(final String[] args) {
        final Czas czas1 = new Czas(1, 2);
        final Czas czas2 = new Czas(3, 4);
        System.out.println(czas1);
        System.out.println(czas1.addczas(czas2));
        System.out.println(czas1.multiplier(3));
    }
}
