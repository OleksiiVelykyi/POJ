package POJ.REMOTE;
public class Remote {
    TV tv;
    public Remote(TV tv){
        this.tv = tv;
    }
    public void ChannelUP(){
        if(tv.On){
            if(tv.channel < 37){
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
    public void changeChannelDOWN(){
        if(tv.On){
            if(tv.channel == 1){
                tv.channel = 37;
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
            if(((tv.volume + ile) > 100) || ((tv.volume + ile) <= 0 )){
              if((tv.volume + ile) > 100){
                  tv.volume = 100;
                  System.out.println("V_MAX");
              }else {
                  tv.volume = 0;
                  System.out.println("V_MIN");
              }
            } else {
                tv.volume = tv.volume + ile;
                System.out.println("The volume is " + tv.volume);
            }
        }else {
            System.out.println("zzzzz");
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
