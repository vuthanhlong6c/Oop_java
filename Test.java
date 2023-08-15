
package test;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Test {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int t;
            t=sc.nextInt();
            while(t-- >0){
                long n,dem=0;
                n=sc.nextLong();
                for(int i=1 ; i<=sqrt(n) ; i++){
                    if(n%i==0){
                        if(i%2==0)
                            dem++;
                        if((n/i!=i)&&(n/i%2==0)){
                            dem++;
                        }
                    }
                }
                System.out.println(dem);
            }
    }
}