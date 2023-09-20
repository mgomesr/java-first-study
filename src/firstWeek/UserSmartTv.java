package firstWeek;


public class UserSmartTv {
    public static void main(String[] args) {

        SmartTv userSmart = new SmartTv();

        System.out.println("A TV está ligada? " + userSmart.power);
        System.out.println("Canal Atual " + userSmart.channel);
        System.out.println("Volume Atual " + userSmart.volume);

        userSmart.powerOff();
        System.out.println("A TV está ligada? " + userSmart.power);

        userSmart.volumeUp();
        userSmart.volumeUp();
        userSmart.volumeUp();
        System.out.println("Volume Atual " + userSmart.volume);

        userSmart.volumeDown();
        userSmart.volumeDown();
        userSmart.volumeDown();
        userSmart.volumeDown();
        userSmart.volumeDown();
        System.out.println("Volume Atual " + userSmart.volume);

        userSmart.defineChannel(13);
        System.out.println("Canal Atual " + userSmart.channel);

    }
    
}
