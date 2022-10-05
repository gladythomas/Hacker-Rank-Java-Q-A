import java.io.*;
import java.util.*;

public class Anagram{
    static  boolean isAnagram(String a, String b){
            if(a.length()!=b.length()){
                return false;
            }
            String a1=a.toLowerCase();
            String a2=b.toLowerCase();
            char[] c=a1.toCharArray();
            char [] d=a2.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
           // System.out.println("Before loop");
            for(int i = 0 ; i < c.length ; i++){
                
              if(c[i]!=d[i]) {
               // System.out.println("Not Anagrams");
             //  System.out.println("inside loop");
            return false;
        }
                }
             
    
    // System.out.println("Anagrams");
            return true;
             
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Solution s=new Solution();
        // s.isAnagram();
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
       if(isAnagram(a,b)){
           System.out.println("Anagrams");
       }else{
           System.out.println("Not Anagrams");
       }
    }
}
