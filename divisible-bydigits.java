package digitmanipulatiion;
import java.util.*;

class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int digits=0;
        while(m!=0)
        {
            digits=m%10;
            if(n%digits==0)
            {
                System.out.println(digits+" ");
            }
            else{
                System.out.println("not divisible by any digits");
            }
            m=m /10;
            
            
            
        }
    }
}