package day11;

import java.util.ArrayList;



/**
 *
 * @author tom
 */
public class MobilePhone extends OldPhone {
    private ArrayList<String> callList = new ArrayList<String>();
    
    public MobilePhone(String brand) {
        super(brand);
    }
    
    @Override
    public void call(String number) {
        super.call(number);
        callList.add(number);
    }
    
    public void ringAlarm(String time) {
        System.out.println("Get Up it's! " + time);
    }
    
    protected void playGame(String game) {
        // Making method protected has no effect because all the classes
        // are in the same package anyway.
        System.out.println("Playing! " + game);
    }
    
    public void printLastNumbers() {
        // Print in reverse order so last called appears first
        // like in a real phone.
        for (int i = callList.size(); i > 0; i--) {
            System.out.println(callList.get(i-1));
        }
    }
    
}
