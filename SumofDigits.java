package digitmanipulatiion;
import java.util.*;
public class SumofDigits {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sumv=0;
        int digits;
        int count=0;
        while(n>0)
        {
            digits=n%10;//default get the last digit
            sumv+=digits;//only this code changes
            // count++;
            n=n/10;//default removes last digit
        }
        System.out.print(sumv);
    }

    
}
