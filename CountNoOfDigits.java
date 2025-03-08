package digitmanipulatiion;
import java.util.*;
public class CountNoOfDigits{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int digits;
        int count=0;
        while(n!=0)//if 0 value is not reading in the input
        {
            digits=n%10;//default get the last digit
            count++;//only this code changes
            n=n/10;//default removes last digit
        }
        System.out.print(count);
    }

    
}

