package poj.lab6
public class Pracownik {
    private final String name;
    private final String surname;
    private final double salary;
    public Pracownik(final String name, final String surname, final double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
