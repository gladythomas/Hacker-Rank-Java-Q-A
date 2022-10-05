import java.io.*;
import java.util.*;

public class SubstringComparisons{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    ArrayList <String> s2=new ArrayList<String>();
    ArrayList<String> strn = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    int n = sc.nextInt();
    
     int len = s.length()-n;
     int i=0;
     while(i<=len){
         String str = s.substring(i,i+n);
         strn.add(str);
         i++;
     }
     Collections.sort(strn);
     System.out.println(strn.get(0));
     System.out.println(strn.get(strn.size()-1));  
       
                
    }
}
