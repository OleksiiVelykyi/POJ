package POJ.REMOTE;
public class Remote {
    TV tv;
    public Remote(TV tv){
        this.tv = tv;
    }
    public void ChannelUP(){
        if(tv.On){
            if(tv.channel < 20){
                tv.channel = tv.channel + 1;
                System.out.println("Channel up TV : " + tv.channel);
            }
            else{
                tv.channel = 1;
                System.out.println("Channel up TV : " + tv.channel);
            }
        }else {
            System.out.println("zzzzz");
        }
    }
    public void ChannelDOWN(){
        if(tv.On){
            if(tv.channel == 1){
                tv.channel = 20;
                System.out.println("Channel down TV : " + tv.channel);
            }
            else{
                tv.channel -= 1;
                System.out.println("Channel down TV : " + tv.channel);
            }
        }else {
            System.out.println("zzzzz");
        }
    }
    public void changeVol(int ile){
        if(tv.On){
            if(((tv.volume + ile) > 10) || ((tv.volume + ile) <= 1 )){
              if((tv.volume + ile) > 10){
                  tv.volume = 10;
                  System.out.println("V_MAX");
              }else {
                  tv.volume = 1;
                  System.out.println("V_MIN");
              }
            } else {
                tv.volume = tv.volume + ile;
                System.out.println("The volume is " + tv.volume);
            }
        }else {
            System.out.println("The volume is MIN");
        }
    }
    public void power(){
        tv.On = !tv.On;
        if (tv.On){
            System.out.println("TV ON" );
        }else {
            System.out.println("TV OFF");
        }
    }
}
