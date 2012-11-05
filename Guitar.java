package day11;

/**
 *
 * @author tom
 */

public class Guitar {
    
    // Methods from MusicalInstrument and WoodenObject classes are associated with
    // properties of the Guitar and could be accesed through a variable that identifies
    // those methods as pertaining to that property.
    public MusicalInstrument music = new MusicalInstrument();
    public WoodenObject material = new WoodenObject();
    
    // main method to demonstrate the class
    public static void main(String[] args) {
        Guitar launcher = new Guitar();
        launcher.launch();
    }
    
    static void launch() {
        Guitar myGuitar = new Guitar();
        myGuitar.music.play();
        myGuitar.material.burn();
        myGuitar.music.value("£350");
        myGuitar.material.value("£5");
    }
    
}
