package poj.lab6.zad2;
import java.util.ArrayList;

public class Zamowienie {
    private final ArrayList<Position> positions;
    private final int maksRozmiar;
    public Zamowienie(final ArrayList<Position> positions, final int maksRozmiar) {
        this.positions = positions;
        this.maksRozmiar = maksRozmiar;
    }
    public Zamowienie(final ArrayList<Position> positions) {
        this(positions, 10);
    }
    public void addPosition(final Position position) {
        if (this.positions.size() == maksRozmiar ) { return; }
        this.positions.add(position);
    }
    @Override
    public String toString() {
        return "Zamowienie wynosi: %s".formatted(this.positions.toString());
    }
}
