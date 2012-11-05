package day11;

/**
 *
 * @author tom
 */
public class PhoneLauncher {
    
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    
    public void launch() {
        System.out.println("SmartPhone Class");
        SmartPhone mySmartPhone = new SmartPhone("HTC");
        mySmartPhone.call("01865 761573");
        mySmartPhone.call("01865 633808");
        mySmartPhone.call("01810 555321");
        mySmartPhone.ringAlarm("09:00");
        mySmartPhone.playGame("TETRIS");
        mySmartPhone.browseWeb("www.mydog.com");
        System.out.println(mySmartPhone.findPosition());
        mySmartPhone.printLastNumbers();
        mySmartPhone.call("0044 255321");
        System.out.println(mySmartPhone.getBrand());
        System.out.println();
        System.out.println("RestrictedSmartPhone Class");
        RestrictedSmartPhone myRestrictedSmartPhone = new RestrictedSmartPhone("Blackberry");
        // This will not work. See RestrictedSmartPhone Class
        // myRestrictedSmartPhone.playGame("Snake");
    }
    
}
