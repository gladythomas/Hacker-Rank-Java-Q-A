import java.io.*;
import java.util.*;
import java.math.BigInteger;  

public class BigDecimal{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        
       BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
