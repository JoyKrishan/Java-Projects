
/**
 * Write a description of BreakingCeasarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;

public class BreakingCeasarCipher {
    
    public  String decryptWithKey(String encrypted, int key){
        EncryptMessage cc = new EncryptMessage();
        String message = cc.encrypt(encrypted, 26-key);
        return message;
    }
    
    public String decryptWithTwoKeys(String encrypted, int key1, int key2){
        EncryptMessage cc = new EncryptMessage();
        String message = cc.twoKeyEncrypt(encrypted , 26-key1, 26-key2);
        return message;
    }
    
    public int[] countLetters(String encrypted){
        String lowerAlphabets= "abcdefghijklmnopqrstuvwxyz";
        int[] counts= new int[26];
        for (int i=0; i<encrypted.length() ; i++){
            char ch = encrypted.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            int index = lowerAlphabets.indexOf(lowerCh);
            if (index !=-1){
                counts[index] +=1;
            }
        }
        return counts;
    }
    
    public int indexOfMax(int[] values){
        int maxIndex=0;
        for (int i=0; i<values.length ; i++){
            if( values[i] > values[maxIndex] ){
                maxIndex= i;
            }
        }
        return maxIndex;
    }
    
    public String decryptWithoutKey(){
        
        FileResource fr = new FileResource();
        String encrypted = fr.asString();
        EncryptMessage cc = new EncryptMessage();
        int[] freq=countLetters(encrypted);
        
       
        int maxIndexed= indexOfMax(freq);
        int dkey = maxIndexed-4;
      
        if (maxIndexed< 4){
            dkey=26-(4-maxIndexed);
        }
        System.out.println("Dkey : "+dkey);
        return cc.encrypt(encrypted , 26- dkey);
    }
   
    public String halfOfString(String message, int start){
        String halfString="";
        for (int i = start; i< message.length(); i=i+2){
            halfString= halfString+message.charAt(i);
            
        }
        return halfString;
    }
    
    public int getKey(String s){
        int[] freq=countLetters(s);
        int maxIndexed= indexOfMax(freq);
        int dkey = maxIndexed-4;
        if (maxIndexed< 4){
            dkey=26-(4-maxIndexed);
        }
        return dkey;
    }
    
    public String decryptTwoKeys(String encrypted){
        String firstMsg= halfOfString(encrypted, 0);
        System.out.println("Half String 1 "+firstMsg);
        String secondMsg= halfOfString(encrypted, 1);
        System.out.println("Half String 2 "+secondMsg);
        int keyFirstMsg = getKey(firstMsg);
        int keySecondMsg = getKey(secondMsg);
        System.out.println("Key 1 : "+ keyFirstMsg);
        System.out.println("Key 2 : "+ keySecondMsg);
        EncryptMessage cc = new EncryptMessage();
        String decrypt = cc.twoKeyEncrypt(encrypted, keyFirstMsg, keySecondMsg);
        return decrypt;
        
    }
    
    public void testDecrypt(){
        String afterEncrypt="Rpc ndj xbpvxct axut LXIWDJI iwt xcitgcti PCS rdbejitgh xc ndjg edrzti?";
        String msg=decryptWithKey(afterEncrypt, 15);
        System.out.println("After Decryption with key: "+msg);
        String test ="Hfs cpwewloj loks cd Hoto kyg Cyy.";
        //String decrypted= decryptWithTwoKeys(test, 14, 24);
        //System.out.println("After Decryption : \t"+decrypted);
        String test2="Qbkm Zgis";
        //String decrypted2=decryptTwoKeys(test);
        //System.out.println("After Decryption : \t"+decrypted2);
        String fileDecrypt=decryptWithoutKey();
        System.out.println("After Decryption withoutkey "+ fileDecrypt);
        
    }
}
