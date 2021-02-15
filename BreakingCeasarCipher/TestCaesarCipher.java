
/**
 * Write a description of TestCaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class TestCaesarCipher {
    
    public void simpleTest(){
        FileResource fr = new FileResource();
        String message = fr.asString();
        CaeserCipher cc_2= new CaeserCipher(15);
        String encrypted=cc_2.encrypt(message);
        String decrypted=cc_2.decryptWithKey(encrypted, 15);
        System.out.println("Original message : \t"+message);
        System.out.println("Encrypted message : \t"+encrypted);
        System.out.println("Decrypted message : \t"+decrypted);
        System.out.println("Decrypting without Key : \t"+breakCaesarCipher(encrypted));
    }
    
    
    public String breakCaesarCipher(String input){
        CaeserCipher bar = new CaeserCipher();
        String decrypted= bar.decryptWithoutKey(input);
        return decrypted;
    }
    
}
