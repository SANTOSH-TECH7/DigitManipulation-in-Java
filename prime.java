package digitmanipulatiion;
import java.util.*;

class prime{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int digits=1;
        while(digits<n)
        {
            digits*=10;
        }
        digits=digits/10;
        while(digits>0)
        {
            int digit =(int) (n/digits);
            for(int i=0;i<=digits;i++)
            {
                if(digit%)
                {
                    
                }
            }
            
        }
        
       
            
    }
}