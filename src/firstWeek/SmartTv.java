package firstWeek;


public class SmartTv {
    boolean power = true;
    int channel = 1;
    int volume = 10;       
    
    public void powerOn() {
        power = true;
    }

    public void powerOff() {
        power = false;
    }

    public void volumeUp() {
        volume += 1;
        System.out.println("Aumentando volume para " + volume);
    }

    public void volumeDown() {
        volume -= 1;
        System.out.println("Diminuindo volume para " + volume);
    }

    public void changeChannelUp() {
        channel += 1;
    }

    public void changeChannelDown() {
        channel -= 1;
    }

    public void defineChannel(int newChannel) {
        channel = newChannel;
    }
}
