/*

Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.




*/
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
