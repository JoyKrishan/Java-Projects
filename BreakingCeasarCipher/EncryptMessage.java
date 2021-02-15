
/**
 * Write a description of EncryptMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class EncryptMessage {

    
    public String encrypt(String input, int key){
        String upperAlphabets= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String upperReverseAlphabets=upperAlphabets.substring(key)+upperAlphabets.substring(0, key);
        String lowerAlphabets= "abcdefghijklmnopqrstuvwxyz";
        String lowerReverseAlphabets= lowerAlphabets.substring(key)+lowerAlphabets.substring(0, key);
        StringBuilder sb = new StringBuilder(input);
        for(int i=0 ; i< sb.length(); i=i+1){
            if ( Character.isAlphabetic(sb.charAt(i)) ){
                if (Character.isUpperCase(sb.charAt(i)) ){
                char ch= sb.charAt(i);
                int indexToReplace= upperAlphabets.indexOf(ch);
                char replacingCh= upperReverseAlphabets.charAt(indexToReplace);
                //System.out.println("Replacing Char : "+ replacingCh);
                sb.setCharAt(i, replacingCh);
                //System.out.println(sb.toString());
            }   
            else{
                char ch= sb.charAt(i);
                int indexToReplace= lowerAlphabets.indexOf(ch);
                char replacingCh= lowerReverseAlphabets.charAt(indexToReplace);
                //System.out.println("Replacing Char : "+ replacingCh);
                sb.setCharAt(i, replacingCh);
        
            }
        }
    }
        return sb.toString();
    
}

    public  String twoKeyEncrypt(String input , int key1, int key2){
        StringBuilder sb = new StringBuilder(input);
        String first = encrypt(input, key1);
        String second = encrypt(input, key2);
        for (int i =0 ; i<sb.length(); i++){
            if ( i%2 == 0){
                char foo = first.charAt(i);
                sb.setCharAt(i,foo);
            }
            else{
                char bar = second.charAt(i);
                sb.setCharAt(i, bar);
            }
        }
        return sb.toString();
    }
    
    public void testCeasar(){
        //FileResource fr =new FileResource();
        String message = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        int key =15;
        String encrypted = encrypt(message, key);
        
        //System.out.println("Encrypted message for the "+key+"\n"+encrypted );
        
        String twoEncrypt= twoKeyEncrypt(message , 21, 8);
        System.out.println("Encrypted message after 2 key encrypt "+"\n"+ twoEncrypt);
        
    
    }
}



