/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

/**
 *
 * @author tom
 */
public class ExtendedString extends String {

    public ExtendedString(String value) {
        super(value);
    }
    
    public void PrintEven() {
        for (int i = 1; i < this.length(); i++) {
            System.out.print(this.substring(i, i+1));
        }
    }
}
