/*

In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.


*/

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
