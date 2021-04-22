package poj.lab6.zad4;
public class Czas {
        final int godziny;
        final int minuty;

    public Czas(final int godziny, final int minuty) {
            this.godziny = godziny;
            this.minuty = minuty;
        }
        public Czas addczas(final Czas new_czas) {
            final int addczas = (this.minuty + new_czas.minuty) / 60;
            return new Czas(this.godziny + new_czas.godziny + addczas, (this.minuty + new_czas.minuty) % 60);
        }
        public Czas multiplier(final int multi) {
            final int addczas = (this.minuty * multi) / 60;
            return new Czas(this.godziny * multi + addczas, (this.minuty * multi) % 60);
        }
        @Override
         public String toString() {
             return (this.godziny+"h\t"+this.minuty+"min");
    }

}
