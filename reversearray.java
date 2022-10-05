import java.util.Scanner;
public class reversearray{
     Scanner sc=new Scanner(System.in);
     
     
    public void reverse(){
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
       // scan.close();
    } 
    
     public static void main(String[] args){
         reversearray r =new reversearray();
         r.reverse();
     }
    
}
