
/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;

public class WordLengths {
    
    public void countWordLengths(FileResource resource, int[] counts){
        for(String word : resource.words() ){
            StringBuilder wrd = new StringBuilder(word);
            int len= wrd.length();
            for ( int i =0; i<wrd.length(); i++ ){
                if ( wrd.charAt(i) == '\'' || wrd.charAt(i) == '\"'){
                    continue;
                }
                
                if ( ! Character.isLetter(wrd.charAt(i)) ) {
                    len=len - 1;
                }
                
            }
            counts[len]=counts[len]+1;
        }
    
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
    
    
    public void testCountWordLengths(){
        FileResource fr = new FileResource();
        int[] counts = new int[31];
        countWordLengths(fr, counts);
        for (int i=0; i<counts.length ; i++){
            if (counts[i]!=0) {
                System.out.println(counts[i]+" words of length "+i);
            }
        }
        
        int maxIndex= indexOfMax(counts);
        System.out.println("The word that occured maximum times is in index "+ maxIndex );
    }
}