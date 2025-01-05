package digitmanipulatiion;
import java.util.*;
public class ReverseNumber{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int digits;
        int rev=0;
        while(n>0)
        {
            digits=n%10;//default get the last digit
            // System.out.print(digits+"");//directly adds and prints
            n=n/10;//default removes last digit
            rev=rev*10+digits;//Using decimal values

        }
        System.out.print(rev);
    }

    
}

