package digitmanipulatiion;
import java.util.*;

public class Amstrong{
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    public int Count(n)
    {
        int digits;
        
        int count=0;
        int amst=0;
        digits=n%10;//default get the last digit
        n=n/10;//default removes last digit
        count+=1;
    }
    
    public static void main(String args[])
    {

        
        while(n>0)//if 0 value is not reading in the input
        {
            
           
            
        }
        amst+=Math.pow(digits,count);
        if(amst==n)
        {
            System.out.print("Amstrong");
        }
        else  System.out.print("NOT Amstrong");
    }

    
}

