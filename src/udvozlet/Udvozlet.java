/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udvozlet;

/**
 *
 * @author t1
 */
public class Udvozlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ember no = new Ember("Éva");
        Ember ferfi = new Ember("Ádám");
        
        System.out.println(no.koszont());
        System.out.println(ferfi.koszont());
    }
    
}
