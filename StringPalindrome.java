import java.io.*;
import java.util.*;

public class StringPalindrome{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer buff=new StringBuffer(A);
        buff.reverse();
        String reverse=buff.toString();
       if(A.equals(reverse)){
           System.out.println("Yes");
       }else{System.out.println("No");}
        
        
        
    }
}
