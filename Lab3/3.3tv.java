package POJ.TV;
public class TV {
    public boolean On;
    public int volume ;
    public int channel;
    public TV(boolean on, int volume , int channel){
        this.volume = volume;
        this.channel = channel;
        this.On = on;
    }
    public void info(){
        if (this.On){
            System.out.println("TV ON, channel "+ this.channel + " volume: "+ this.volume);
        }else {
            System.out.println("TV OFF");
        }
    }
}
