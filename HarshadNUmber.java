package digitmanipulatiion;
import java.util.*;
public class HarshadNUmber{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int digits;
        int sumv=0;
        while(n>0)
        {
            digits=n%10;//default get the last digit
            sumv+=digits;//only this code changes
            n=n/10;//default removes last digit
            

        }
        if(org%sumv==0)
        {
            System.out.printf("%d is Harshad number ",org);
        }
        else System.out.printf("%d is NOT Harshad number",org);
    }

    
}

