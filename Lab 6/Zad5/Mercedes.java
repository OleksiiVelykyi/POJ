package poj.lab6.zad5;
public class Mercedes extends Samochod{
    public Mercedes(final String kolor, final int rocznik) {
        super(kolor, rocznik);
    }
    @Override
    public void accelerate() {
        predkosc += 30;
        if(predkosc > limitPredkosci) {
            predkosc = limitPredkosci;
        }
    }
}
