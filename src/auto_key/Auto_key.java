/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_key;

/**
 *
 * @author Ahmed_Martin
 */
public class Auto_key {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        // call class auto_key with key deceptive
        auto_key_algorithm au = new auto_key_algorithm("deceptive");
        
        // call encryption method to encrypt message
        String cipher = au.encrypt("wearediscoveredsaveyourself");
        System.out.println(cipher);
        System.out.println(au.decrypt(cipher)); // call decrypt method to decrypt cipher text
    }
    
}
