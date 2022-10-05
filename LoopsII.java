import java.util.*;
import java.io.*;

class LoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // while(n-1!=0){
            //  a=a+x*b;
            //  System.out.print(a+" ");
            //  x=x*2;  
             
            //  n--;
            //  }
              
              int x=1;
              for(int k=0;k<n;k++){
                a=a+x*b;
                System.out.print(a+" ");
                x=x*2;
            }
            System.out.println();
           
            
        }
        in.close();
    }
}
