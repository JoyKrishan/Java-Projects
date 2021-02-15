
/**
 * Write a description of CaeserCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class CaeserCipher {
    private String upperAlphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String upperShiftedAlphabets="";
    private String lowerAlphabets="abcdefghijklmnopqrstuvwxyz";
    private String lowerShiftedAlphabets="";
    
    public CaeserCipher(){
    }
    
    public CaeserCipher(int key){
        this.upperShiftedAlphabets=upperAlphabets.substring(key)+upperAlphabets.substring(0, key);
        this.lowerShiftedAlphabets= lowerAlphabets.substring(key)+lowerAlphabets.substring(0, key);
    }
    
    public String encrypt(String input){
        StringBuilder sb = new StringBuilder(input);
        for(int i=0 ; i< sb.length(); i=i+1){
            if ( Character.isAlphabetic(sb.charAt(i)) ){
                if (Character.isUpperCase(sb.charAt(i)) ){
                char ch= sb.charAt(i);
                int indexToReplace= upperAlphabets.indexOf(ch);
                char replacingCh= upperShiftedAlphabets.charAt(indexToReplace);
                //System.out.println("Replacing Char : "+ replacingCh);
                sb.setCharAt(i, replacingCh);
                //System.out.println(sb.toString());
            }   
            else{
                char ch= sb.charAt(i);
                int indexToReplace= lowerAlphabets.indexOf(ch);
                char replacingCh= lowerShiftedAlphabets.charAt(indexToReplace);
                //System.out.println("Replacing Char : "+ replacingCh);
                sb.setCharAt(i, replacingCh);
        
            }
        }
    }
        return sb.toString();
    
    }
    
    public void countLetters(int[] counts, String encrypted){
        for (int i=0; i<encrypted.length() ; i++){
            char ch = encrypted.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            int index = lowerAlphabets.indexOf(lowerCh);
            if (index !=-1){
                counts[index]++;
            }
        }
        
    }
    
     public String decryptWithoutKey(String input){
        int[] countLetters = new int[26];
        countLetters(countLetters, input);
        
        WordLengths wl = new WordLengths();
        int maxIndexed= wl.indexOfMax(countLetters);
        int dkey = maxIndexed-4;
        if (maxIndexed< 4){
            dkey=26-(4-maxIndexed);
        }
        CaeserCipher foo = new CaeserCipher(26-dkey);
        return foo.encrypt(input);
    }
    
    public  String decryptWithKey(String encrypted, int dkey){
        CaeserCipher cc = new CaeserCipher(26-dkey);
        return cc.encrypt(encrypted);
    }
    
}

